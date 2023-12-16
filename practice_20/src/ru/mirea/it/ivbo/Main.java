package ru.mirea.it.ivbo;

public class Main {
    public static void main(String[] args) {
        GenericParams<Integer, String, Double> object = new GenericParams<>(52, "Hello", 3.1);
        object.printClassNames();
    }
}