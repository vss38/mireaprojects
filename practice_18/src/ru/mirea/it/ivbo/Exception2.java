package ru.mirea.it.ivbo;

import java.util.Scanner;
public class Exception2
{
    public void exceptionDemo()
    {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = -1;
        try
        {
            i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (NumberFormatException e) {
            System.out.println("Number isn't an integer\n" + e);
        }
        catch (Exception e){
            System.out.println("General exception");
        }
        finally {
            System.out.println("After exceptions");
        }
    }
}