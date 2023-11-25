package ru.mirea.it.ivbo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberChecker
{
    public NumberChecker(String text)
    {
        boolean containsNumberWithoutPlus = checkNumbersWithoutPlus(text);

        if (containsNumberWithoutPlus)
            System.out.println("Текст содержит цифры без знака '+'");
        else
            System.out.println("Текст не содержит цифры без знака '+'");
    }

    public static boolean checkNumbersWithoutPlus(String text)
    {
        Pattern pattern = Pattern.compile("\\d+[^+]");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
