package ru.mirea.it.ivbo;

public class Memory
{
    private int size;
    private String type;

    public Memory(int size, String type)
    {
        this.size = size;
        this.type = type;
    }

    public int getSize()
    {
        return size;
    }

    public String getType()
    {
        return type;
    }
}
