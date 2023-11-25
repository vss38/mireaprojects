package ru.mirea.it.ivbo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparison
{
    public DateComparison(String userInput)
    {
        Date currentDate = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date userDate = null;
        try
        {
            userDate = dateFormat.parse(userInput);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }

        if (userDate != null)
        {
            if (currentDate.before(userDate))
            {
                System.out.println("Теущая дата и время меньше, чем введенная");
            } else if (currentDate.after(userDate))
            {
                System.out.println("Текущая дата и время больше, чем введенная");
            } else
            {
                System.out.println("Текущая дата и время равны введенной");
            }
        }
    }
}