package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №14\n\n0 - выход\n1-4 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №3");
                    String text1 = "Список цен:\n" +
                            "1. 25.98 USD\n" +
                            "2. 500 RUB\n" +
                            "3. 10.75 EU\n" +
                            "4. 44 ERR\n" +
                            "5. 0.004 EU";
                    System.out.println(text1 + '\n');
                    PriceExtractor p3 = new PriceExtractor(text1);
                    break;
                case (2):
                    System.out.println("Открыт пункт №4");
                    String text2 = "(1 + 8) – 9 / 4";
                    System.out.println(text2);
                    NumberChecker p4 = new NumberChecker(text2);
                    break;
                case (3):
                    System.out.println("Открыт пункт №5");
                    DateChecker p5 = new DateChecker();
                    break;
                case (4):
                    System.out.println("Открыт пункт №6");
                    EmailChecker p6 = new EmailChecker();
                    break;
            }
        }
    }
}