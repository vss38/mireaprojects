package ru.mirea.it.ivbo;

public class Part_14
{
    public static void recursion(int n)
    {
        if (n < 10)
            System.out.print(n + " ");
        else
        {
            recursion(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
