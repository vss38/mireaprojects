package ru.mirea.it.ivbo;

public class Computer
{
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor)
    {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public enum Brand
    {
        HP,
        Dell,
        Lenovo,
        Asus
    }

    public Brand getBrand()
    {
        return this.brand;
    }

    public Processor getProcessor()
    {
        return this.processor;
    }

    public Memory getMemory()
    {
        return this.memory;
    }

    public Monitor getMonitor()
    {
        return this.monitor;
    }
}