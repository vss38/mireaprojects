package ru.mirea.it.ivbo;

public interface Nameable
{
    String getName();
}
class Planet implements Nameable
{
    private String name;

    public Planet(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
class Car implements Nameable
{
    private String name;

    public Car(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}