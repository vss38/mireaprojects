package ru.mirea.it.ivbo;

public class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидим на магическом стуле");
    }
}
