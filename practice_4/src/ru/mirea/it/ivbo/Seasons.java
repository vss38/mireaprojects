package ru.mirea.it.ivbo;

public class Seasons
{
    enum Season
    {
        SPRING("Весна", 15),
        SUMMER("Лето", 30) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN("Осень", 10),
        WINTER("Зима", -15);

        private String name;
        private int averageTemperature;

        Season(String name, int averageTemperature)
        {
            this.name = name;
            this.averageTemperature = averageTemperature;
        }

        public String getName()
        {
            return name;
        }

        public int getAverageTemperature()
        {
            return averageTemperature;
        }

        public String getDescription()
        {
                return "Холодное время года";
        }
    }

    public Seasons()
    {
        Season favoriteSeason = Season.SUMMER;

        System.out.println("Название времени года: " + favoriteSeason.getName());
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + " градусов");
        System.out.println("Описание времени года: " + favoriteSeason.getDescription());

        printSeasonInfo(Season.SPRING);
        printSeasonInfo(Season.SUMMER);
        printSeasonInfo(Season.AUTUMN);
        printSeasonInfo(Season.WINTER);
    }

    public static void printSeasonInfo(Season season)
    {
        switch (season) {
            case SPRING:
                System.out.println("Время года: Весна");
                break;
            case SUMMER:
                System.out.println("Время года: Лето");
                break;
            case AUTUMN:
                System.out.println("Время года: Осень");
                break;
            case WINTER:
                System.out.println("Время года: Зима");
                break;
            default:
                System.out.println("Неизвестное время года");
                break;
        }

        System.out.println("Средняя температура: " + season.getAverageTemperature());
        System.out.println("Описание времени года: " + season.getDescription());
    }
}