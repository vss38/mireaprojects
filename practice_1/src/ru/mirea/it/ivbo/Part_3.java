package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Part_3 {
    public Part_3() {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        while(size<1)
        {
            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();
        }

        int[] numbers = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++)
        {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum += numbers[i];
        }

        double average = (double) sum / size;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}
