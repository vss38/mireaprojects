package ru.mirea.it.ivbo;

public class MultiFunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидим на многофункциональном стуле");
    }
}