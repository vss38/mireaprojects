package ru.mirea.it.ivbo;

public interface MathCalculable
{
    double power(double base, double exponent);
    double complexModule(double real, double imaginary);
    double getPI();
}

class MathFunc implements MathCalculable
{
    @Override
    public double power(double base, double exponent)
    {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModule(double real, double imaginary)
    {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    @Override
    public double getPI()
    {
        return Math.PI;
    }
}