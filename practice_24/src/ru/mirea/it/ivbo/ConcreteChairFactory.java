package ru.mirea.it.ivbo;

public class ConcreteChairFactory extends ChairFactory {
    @Override
    public Chair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public Chair createMultiFunctionalChair() {
        return new MultiFunctionalChair();
    }

    @Override
    public Chair createMagicChair() {
        return new MagicChair();
    }
}
