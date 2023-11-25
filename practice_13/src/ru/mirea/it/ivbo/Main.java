package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №13\n\n0 - выход\n1-2 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №1");

                    String line = "I like java, qfkfqlkfqlk, java the best!!!";

                    System.out.println("Последний символ: " + line.charAt(line.length() - 1));
                    System.out.println("endsWith(\"!!!\"): " + line.endsWith("!!!"));
                    System.out.println("startsWith(\"I like\"): " + line.startsWith("I like"));
                    System.out.println("contains(\"Java\"): " + line.contains("Java"));

                    System.out.println(line.toUpperCase());
                    System.out.println(line.toLowerCase());
                    String secondLine = line.substring(0, 5);
                    System.out.println(secondLine);

                    break;
                case (2):
                    System.out.println("Открыт пункт №2");
                    Person ob = new Person("Вячеслав", "Столяров", "Сергеевич");
                    Person ob1 = new Person("Иванов");

                    System.out.println(ob.getFullname());
                    System.out.println(ob1.getFullname());
                    break;
            }
        }
    }
}