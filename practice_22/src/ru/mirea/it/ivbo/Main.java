package ru.mirea.it.ivbo;

public class Main {
    public static void main(String[] args) {
        String expression = "3 4 + 2 * 7 /"; // (3 + 4) * 2 / 7
        double result = RPNCalculator.calculateRPN(expression);
        System.out.println("Ответ: " + result);
    }
}