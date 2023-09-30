package ru.mirea.it.ivbo;

import java.util.Scanner;
public class Part_8 {
    public Part_8()
    {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        String str;

        while(size<1)
        {
            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();
        }

        String[] strs = new String[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++)
        {
            strs[i] = scanner.next();
        }

        for (int i = 0; i < size/2; i+=1)
        {
            str = strs[i];
            strs[i] = strs[size-1-i];
            strs[size-1-i] = str;
        }

        System.out.println("Элементы массива в обратном порядке:");
        for (int i = 0; i < size; i++)
        {
            System.out.println(strs[i]);
        }
    }
}
