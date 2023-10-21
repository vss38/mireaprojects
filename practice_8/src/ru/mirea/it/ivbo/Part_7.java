package ru.mirea.it.ivbo;

public class Part_7
{
    public static void recursion(int n)
    {
        recursion(n, 2);
    }
    public static void recursion(int n, int g)
    {
        if (g > n)
            return;
        if (n%g==0)
        {
            System.out.println(g);
            recursion(n/g, 2);
        }
        else
            recursion(n, g+1);
    }
}
