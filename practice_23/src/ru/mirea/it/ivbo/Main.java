package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №23\n\n0 - выход\n1-2 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №2");
                    LinkedQueue<Integer> queue = new LinkedQueue<>();
                    queue.enqueue(10);
                    queue.enqueue(20);
                    queue.enqueue(30);

                    System.out.println(queue.dequeue()); // 10
                    System.out.println(queue.element()); // 20
                    System.out.println(queue.size()); // 2
                    System.out.println(queue.isEmpty()); // false

                    queue.clear();
                    System.out.println(queue.size()); // 0
                    System.out.println(queue.isEmpty()); // true
                    break;
                case (2):
                    System.out.println("Открыт пункт №3");
                    Expression expression = new Add(
                            new Subtract(
                                    new Multiply(new Variable("x"), new Variable("x")),
                                    new Multiply(new Const(2), new Variable("x"))
                            ),
                            new Const(1)
                    );

                    if (args.length > 0) {
                        double x = Double.parseDouble(args[0]);
                        double result = expression.evaluate(x);
                        System.out.println("Результат: " + result);
                    } else {
                        System.out.println("Необходимо передать аргумент x");
                    }
                    break;
            }
        }
    }
}