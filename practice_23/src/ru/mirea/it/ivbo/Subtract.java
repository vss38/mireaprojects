package ru.mirea.it.ivbo;

public class Subtract extends BinaryOperation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}