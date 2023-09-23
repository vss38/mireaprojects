package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №1\n\n0 - выход\n1-5 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №3");
                    Part_3 p3 = new Part_3();
                    break;
                case (2):
                    System.out.println("Открыт пункт №4");
                    Part_4 p4 = new Part_4();
                    break;
                case (3):
                    System.out.println("Открыт пункт №5");
                    Part_5 p5 = new Part_5(args);
                    break;
                case (4):
                    System.out.println("Открыт пункт №6");
                    Part_6 p6 = new Part_6();
                    break;
                case (5):
                    System.out.println("Открыт пункт №7");
                    Part_7 p7 = new Part_7();
                    break;
            }
        }
    }
}