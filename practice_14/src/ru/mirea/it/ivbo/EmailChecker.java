package ru.mirea.it.ivbo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker
{
    public EmailChecker()
    {
        String email1 = "user@example.com";
        String email2 = "root@localhost";
        String email3 = "myhost@@@com.ru";
        String email4 = "@my.ru";
        String email5 = "Julia String";

        System.out.println(email1 + ": " + isValidEmail(email1));
        System.out.println(email2 + ": " + isValidEmail(email2));
        System.out.println(email3 + ": " + isValidEmail(email3));
        System.out.println(email4 + ": " + isValidEmail(email4));
        System.out.println(email5 + ": " + isValidEmail(email5));
    }

    public static boolean isValidEmail(String email)
    {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}