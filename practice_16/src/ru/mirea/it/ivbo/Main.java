package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №16\n\n0 - выход\n1-2 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №2");
                    TextEditor p2 = new TextEditor();
                    break;
                case (2):
                    System.out.println("Открыт пункт №3");
                    PasswordChecker p3 = new PasswordChecker();
                    break;
            }
        }
    }
}