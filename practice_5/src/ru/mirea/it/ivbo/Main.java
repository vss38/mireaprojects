package ru.mirea.it.ivbo;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №5\n\n0 - выход\n1-2 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №1");
                    FootballMatch footballMatch = new FootballMatch();
                    footballMatch.setVisible(true);
                    break;
                case (2):
                    System.out.println("Открыт пункт №3");

                    if (args.length != 1) {
                        System.out.println("Usage: java ImageWindow <imagePath>");
                        break;
                    }

                    SwingUtilities.invokeLater(() -> new ImageWindow(args[0]));
                    break;
            }
        }
    }
}