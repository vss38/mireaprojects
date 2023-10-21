package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №6\n\n0 - выход\n1-3 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №3");

                    Planet earth = new Planet("Земля");
                    String planetName = earth.getName();
                    System.out.println("Планета: " + planetName);

                    Car ford = new Car("Hyundai");
                    String carName = ford.getName();
                    System.out.println("Автомобиль: " + carName);

                    break;
                case (2):
                    System.out.println("Открыт пункт №4");

                    Product phone = new Product("Телефон", 10000.0);
                    double phonePrice = phone.getPrice();
                    System.out.println("Стоимость телефона: " + phonePrice);

                    Service repair = new Service("Ремонт", 2000.0);
                    double repairPrice = repair.getPrice();
                    System.out.println("Стоимость ремонта: " + repairPrice);

                    break;
                case (3):
                    System.out.println("Открыты пункты №6-7");

                    Book book = new Book("Преступление и наказание", "Ф.М.Достоевский");
                    book.print();

                    break;
            }
        }
    }
}