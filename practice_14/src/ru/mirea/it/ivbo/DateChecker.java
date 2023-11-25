package ru.mirea.it.ivbo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateChecker
{
    public DateChecker()
    {
        String date1 = "29/02/2000";
        String date2 = "30/04/2003";
        String date3 = "01/01/2003";
        String date4 = "29/02/2001";
        String date5 = "30-04-2003";
        String date6 = "1/1/1899";

        System.out.println(date1 + ": " + isValidDate(date1));
        System.out.println(date2 + ": " + isValidDate(date2));
        System.out.println(date3 + ": " + isValidDate(date3));
        System.out.println(date4 + ": " + isValidDate(date4));
        System.out.println(date5 + ": " + isValidDate(date5));
        System.out.println(date6 + ": " + isValidDate(date6));
    }

    public static boolean isValidDate(String date)
    {
        Pattern pattern = Pattern.compile("^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$");
        Matcher matcher = pattern.matcher(date);
        if (!matcher.matches())
            return false;

        int day = Integer.parseInt(matcher.group(1));
        int month = Integer.parseInt(matcher.group(2));
        int year = Integer.parseInt(matcher.group(3));

        boolean isValidDay = (month == 2 && day <= 29 && (day != 29 || year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)))
                || (month != 2 && day <= 31 && ((month % 2 == 1 && month <= 7) || (month % 2 == 0 && month >= 8)));

        boolean isValidYear = year >= 1900 && year <= 9999;

        return isValidDay && isValidYear;
    }
}