package ru.mirea.it.ivbo;

public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ConcreteChairFactory();

        Chair victorianChair = chairFactory.createVictorianChair();
        Chair multiFunctionalChair = chairFactory.createMultiFunctionalChair();
        Chair magicChair = chairFactory.createMagicChair();

        Client client = new Client();
        client.sit(victorianChair);
        client.sit(multiFunctionalChair);
        client.sit(magicChair);
    }
}