package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    /*
    //3 пункт
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
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
     */

    /*
    //4 пункт
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
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
     */

    /*
    //5 пункт
    public static void main(String[] args)
    {
        // Используем цикл for для перебора всех аргументов командной строки
        for (int i = 0; i < args.length; i++)
        {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
     */

    /*
    //6 пункт
    public static void main(String[] args)
    {
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
     */

    /*
    //7 пункт
    public static void main(String[] args)
    {
        int number = 5;
        long factorial = factorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    private static long factorial(int n)
    {
        long factorial = 1;
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
    */
}