package ru.mirea.it.ivbo;

public class Add extends BinaryOperation {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) + right.evaluate(x);
    }
}