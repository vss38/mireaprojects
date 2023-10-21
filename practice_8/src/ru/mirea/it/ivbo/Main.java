package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №8\n\n0 - выход\n1-4 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №2");

                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Введите N: ");
                    Part_2.recursion(scanner1.nextInt());

                    break;
                case (2):
                    System.out.println("Открыт пункт №5");

                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Введите N: ");
                    Part_5.recursion(scanner2.nextInt());

                    break;
                case (3):
                    System.out.println("Открыт пункт №7");

                    Scanner scanner3 = new Scanner(System.in);
                    System.out.print("Введите N: ");
                    Part_7.recursion(scanner3.nextInt());

                    break;
                case (4):
                    System.out.println("Открыт пункт №14");

                    Scanner scanner4 = new Scanner(System.in);
                    System.out.print("Введите N: ");
                    Part_14.recursion(scanner4.nextInt());
                    System.out.println();

                    break;
            }
        }
    }
}