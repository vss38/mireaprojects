package ru.mirea.it.ivbo;

import java.util.Scanner;

public class ThrowsDemo2
{
    public void getKey()
    {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        while (true)
        {
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
    public void printDetails(String key) throws Exception
    {
        String message = null;
        message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) throws Exception
    {
        if (key.equals("")) throw new Exception("Key set to empty string");
        return "data for " + key;
    }
}
