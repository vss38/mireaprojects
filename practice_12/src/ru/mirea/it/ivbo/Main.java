package ru.mirea.it.ivbo;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №12\n\n0 - выход\n1-2 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №1");
                    JFrame frame = new JFrame("Random Shapes");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    ShapeCanvas canvas = new ShapeCanvas();
                    frame.add(canvas);

                    frame.pack();
                    frame.setVisible(true);
                    break;
                case (2):
                    System.out.println("Открыт пункт №3");
                    SwingUtilities.invokeLater(AnimationWindow::new);
                    break;
            }
        }
    }
}