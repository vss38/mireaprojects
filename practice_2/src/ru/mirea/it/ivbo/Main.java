package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №2\n\n0 - выход\n1-2 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №1");
                    TestAuthor p1 = new TestAuthor("Tom", "old_email", 'm');
                    break;
                case (2):
                    System.out.println("Открыт пункт №8");
                    Part_8 p8 = new Part_8();
                    break;
            }
        }
    }
}