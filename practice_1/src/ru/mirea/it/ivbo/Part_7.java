package ru.mirea.it.ivbo;

public class Part_7 {
    public Part_7() {
        int number = 5;
        long factorial = factorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    private static long factorial(int n)
    {
        long factorial = 1;
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
}
