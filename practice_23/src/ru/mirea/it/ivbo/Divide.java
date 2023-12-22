package ru.mirea.it.ivbo;

public class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) / right.evaluate(x);
    }
}