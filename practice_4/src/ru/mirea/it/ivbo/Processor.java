package ru.mirea.it.ivbo;

public class Processor
{
    private String model;
    private double speed;

    public Processor(String model, double speed)
    {
        this.model = model;
        this.speed = speed;
    }

    public String getModel()
    {
        return model;
    }

    public double getSpeed()
    {
        return speed;
    }
}
