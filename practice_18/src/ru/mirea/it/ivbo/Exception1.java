package ru.mirea.it.ivbo;

public class Exception1
{
    public void exceptionDemo()
    {
        System.out.println(2.0 / 0.0);
    }
    public void exceptionDemo2()
    {
        try
        {
            System.out.println( 2/0 );
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}