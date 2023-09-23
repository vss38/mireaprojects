package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Part_4 {
    public Part_4() {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        while(size<1)
        {
            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();
        }

        int[] numbers = new int[size];

        System.out.println("Введите элементы массива:");
        int i = 0;
        do
        {
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < size);

        int sum = 0;
        i = 0;
        while (i < size)
        {
            sum += numbers[i];
            i++;
        }

        int max = numbers[0];
        int min = numbers[0];
        i = 1;
        while (i < size)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
            if (numbers[i] < min)
            {
                min = numbers[i];
            }
            i++;
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}
