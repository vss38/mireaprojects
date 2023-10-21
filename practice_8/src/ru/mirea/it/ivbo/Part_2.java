package ru.mirea.it.ivbo;

public class Part_2
{
    public static void recursion(int n)
    {
        recursion(n, 1);
    }
    public static void recursion(int n, int g)
    {
        System.out.println(g);
        if(g < n)
            recursion(n, g + 1);
    }
}
