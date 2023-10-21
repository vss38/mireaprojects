package ru.mirea.it.ivbo;

public class Part_5
{
    public static void recursion(int n)
    {
        recursion(n, 0);
    }
    public static void recursion(int n, int g)
    {
        if(n != 0)
            recursion(n/10, g + n%10);
        else
            System.out.println(g);
    }
}
