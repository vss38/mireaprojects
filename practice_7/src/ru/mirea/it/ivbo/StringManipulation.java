package ru.mirea.it.ivbo;

public interface StringManipulation
{
    int countCharacters(String s);
    String getOddCharacters(String s);
    String reverseString(String s);
}

class ProcessStrings implements StringManipulation
{
    @Override
    public int countCharacters(String s)
    {
        return s.length();
    }

    @Override
    public String getOddCharacters(String s)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
            {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
}
