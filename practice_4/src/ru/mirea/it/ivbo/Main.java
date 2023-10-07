package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №4\n\n0 - выход\n1-2 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №1");
                    Seasons seasons = new Seasons();
                    break;
                case (2):
                    System.out.println("Открыт пункт №4");
                    Processor processor = new Processor("Intel i3", 2.2);
                    Memory memory = new Memory(8, "DDR4");
                    Monitor monitor = new Monitor("LG", 1920);

                    Computer computer = new Computer(Computer.Brand.Lenovo, processor, memory, monitor);

                    System.out.println("Марка компьютера: " + computer.getBrand());
                    System.out.println("Модель процессора: " + computer.getProcessor().getModel());
                    System.out.println("Скорость процессора: " + computer.getProcessor().getSpeed() + " GHz");
                    System.out.println("Размер памяти: " + computer.getMemory().getSize() + " GB");
                    System.out.println("Тип памяти: " + computer.getMemory().getType());
                    System.out.println("Модель монитора: " + computer.getMonitor().getModel());
                    System.out.println("Разрешение монитора: " + computer.getMonitor().getResolution());
                    break;
            }
        }
    }
}