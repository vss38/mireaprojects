package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №4.1\n\n0 - выход\n1-2 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №3");

                    Person person1 = new Person();
                    person1.move();
                    person1.talk();

                    Person person2 = new Person("Иван", 20);
                    person2.move();
                    person2.talk();

                    break;
                case (2):
                    System.out.println("Открыт пункт №4");

                    double[][] data1 = {{1.0, 2.0}, {3.0, 4.0}};
                    Matrix matrix1 = new Matrix(data1);
                    System.out.println("1-ая матрица:");
                    matrix1.print();

                    double[][] data2 = {{5.0, 6.0}, {7.0, 8.0}};
                    Matrix matrix2 = new Matrix(data2);
                    System.out.println("2-ая матрица:");
                    matrix2.print();

                    Matrix sum = matrix1.add(matrix2);
                    System.out.println("Сумма матриц:");
                    sum.print();

                    Matrix product = matrix1.multiply(2.0);
                    System.out.println("Умножение матрицы на число:");
                    product.print();

                    Matrix product2 = matrix1.multiply(matrix2);
                    System.out.println("Умножение матриц:");
                    product2.print();

                    break;
            }
        }
    }
}