package ru.mirea.it.ivbo;

public class Part_6 {
    public Part_6() {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++)
        {
            double harmonicNumber = harmonicNum(i);
            System.out.printf("Число %d: %.5f%n", i, harmonicNumber);
        }
    }

    private static double harmonicNum(int n)
    {
        double sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += 1.0 / i;
        }
        return sum;
    }
}
