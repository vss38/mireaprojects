package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №18\n\n0 - выход\n1-4 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №1");
                    Exception1 exception1 = new Exception1();
                    exception1.exceptionDemo();
                    exception1.exceptionDemo2();
                    break;
                case (2):
                    System.out.println("Открыты пункты №2-4");
                    Exception2 exception2 = new Exception2();
                    exception2.exceptionDemo();
                    break;
                case (3):
                    System.out.println("Открыты пункты №5-6");
                    ThrowsDemo throwsDemo = new ThrowsDemo();
                    throwsDemo.getDetails("Ключ");
                    throwsDemo.getDetails(null);
                    break;
                case (4):
                    System.out.println("Открыты пункты №7-8");
                    ThrowsDemo2 throwsDemo2 = new ThrowsDemo2();
                    throwsDemo2.getKey();
                    break;
            }
        }
    }
}