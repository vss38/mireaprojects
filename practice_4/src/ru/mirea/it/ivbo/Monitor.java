package ru.mirea.it.ivbo;

public class Monitor
{
    private String model;
    private int resolution;

    public Monitor(String model, int resolution)
    {
        this.model = model;
        this.resolution = resolution;
    }

    public String getModel()
    {
        return model;
    }

    public int getResolution()
    {
        return resolution;
    }
}