package ru.mirea.it.ivbo;

public class ThrowsDemo
{
    private String key;
    public void getDetails(String key)
    {
        if(key == null) try
        {
            throw new NullPointerException("null key in getDetails");
        }
        catch (NullPointerException e)
        {
            System.out.println("Пустой ключ");
        }
        else {
            this.key = key;
            printMessage();
        }
    }
    public String getKey()
    {
        return this.key;
    }
    private void printMessage()
    {
        System.out.println(getKey());
    }
}
