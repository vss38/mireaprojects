package ru.mirea.it.ivbo;

public interface Priceable
{
    double getPrice();
}
class Product implements Priceable
{
    private String name;
    private double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice()
    {
        return price;
    }
}
class Service implements Priceable
{
    private String description;
    private double hourlyRate;

    public Service(String description, double hourlyRate)
    {
        this.description = description;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice()
    {
        return hourlyRate;
    }
}