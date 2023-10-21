package ru.mirea.it.ivbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №7\n\n0 - выход\n1-3 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №4");

                    MathFunc mathFunc = new MathFunc();

                    double powerResult = mathFunc.power(2.0, 4.0);
                    System.out.println("2 в степени 4 равно: " + powerResult);

                    double complexModuleResult = mathFunc.complexModule(3.0, 4.0);
                    System.out.println("Модуль комплексного числа (3 + 4i) равен: " + complexModuleResult);

                    double piValue = mathFunc.getPI();
                    System.out.println("Число π равно: " + piValue);

                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Введите радиус окружности: ");
                    double radius = scanner1.nextDouble();
                    System.out.println("Длина окружности: " + 2 * piValue * radius);

                    break;
                case (2):
                    System.out.println("Открыты пункты №5-6");

                    ProcessStrings processStr = new ProcessStrings();

                    String s = "Hello, world!";
                    System.out.println("Исходная строка: " + s);

                    int characterCount = processStr.countCharacters(s);
                    System.out.println("Количество символов: " + characterCount);

                    String oddCharacters = processStr.getOddCharacters(s);
                    System.out.println("Нечётные символы: " + oddCharacters);

                    String reversedString = processStr.reverseString(s);
                    System.out.println("Инверсия строки: " + reversedString);

                    break;
                case (3):
                    System.out.println("Открыты пункты №7-8");

                    Printable[] printable = new Printable[5];
                    printable[0] = new Magazine("Журнал №1");
                    printable[1] = new Magazine("Журнал №2");
                    printable[2] = new Book("Книга №1");
                    printable[3] = new Magazine("Журнал №3");
                    printable[4] = new Book("Книга №2");

                    System.out.println("Журналы: ");
                    Magazine.printMagazines(printable);
                    System.out.println("Книги: ");
                    Book.printBooks(printable);

                    break;
            }
        }
    }
}