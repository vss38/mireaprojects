package ru.mirea.it.ivbo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PriceExtractor
{
    public PriceExtractor(String text)
    {

        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?\\s(USD|RUB|EU)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String price = matcher.group();
            System.out.println(price);
        }
    }
}
