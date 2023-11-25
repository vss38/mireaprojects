package ru.mirea.it.ivbo;

import java.util.Scanner;
import java.util.Date;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №11\n\n0 - выход\n1-5 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №1");
                    AssignmentDeadline p1 = new AssignmentDeadline("Иванов");
                    break;
                case (2):
                    System.out.println("Открыт пункт №2");

                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Введите дату и время (в формате dd.MM.yyyy HH:mm:ss): ");
                    String userInput = scanner2.nextLine();

                    DateComparison p2 = new DateComparison(userInput);

                    break;
                case (3):
                    System.out.println("Открыт пункт №3");

                    String name = "Иванов Иван";
                    Date birthDate = new Date();

                    Student student = new Student(name, birthDate);

                    System.out.println("Короткий формат даты рождения: " + student.toString("dd.MM.yy"));
                    System.out.println("Средний формат даты рождения: " + student.toString("dd MMMM yyyy"));
                    System.out.println("Полный формат даты рождения: " + student.toString("dd MMMM yyyy HH:mm:ss"));
                    break;
                case (4):
                    System.out.println("Открыт пункт №4");

                    Scanner scanner4 = new Scanner(System.in);

                    System.out.print("Введите год: ");
                    int year = scanner4.nextInt();
                    System.out.print("Введите месяц (от 1 до 12): ");
                    int month = scanner4.nextInt();
                    System.out.print("Введите число: ");
                    int day = scanner4.nextInt();
                    System.out.print("Введите часы: ");
                    int hours = scanner4.nextInt();
                    System.out.print("Введите минуты: ");
                    int minutes = scanner4.nextInt();

                    Date date = new Date(year - 1900, month - 1, day, hours, minutes);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(year, month - 1, day, hours, minutes);

                    System.out.println("Объект Date: " + date);
                    System.out.println("Объект Calendar: " + calendar.getTime());
                    break;
                case (5):
                    System.out.println("Открыт пункт №5");

                    int n = 100000;

                    List<Integer> arrayList = new ArrayList<>();
                    List<Integer> linkedList = new LinkedList<>();

                    for (int i = 0; i < n; i++) {
                        arrayList.add(i);
                        linkedList.add(i);
                    }

                    long startTime = System.nanoTime();
                    arrayList.add(n / 2, n);
                    long endTime = System.nanoTime();
                    long arrayListInsertionTime = endTime - startTime;

                    startTime = System.nanoTime();
                    linkedList.add(n / 2, n);
                    endTime = System.nanoTime();
                    long linkedListInsertionTime = endTime - startTime;

                    startTime = System.nanoTime();
                    arrayList.remove(n / 2);
                    endTime = System.nanoTime();
                    long arrayListRemovalTime = endTime - startTime;

                    startTime = System.nanoTime();
                    linkedList.remove(n / 2);
                    endTime = System.nanoTime();
                    long linkedListRemovalTime = endTime - startTime;

                    startTime = System.nanoTime();
                    arrayList.add(n);
                    endTime = System.nanoTime();
                    long arrayListAdditionTime = endTime - startTime;

                    startTime = System.nanoTime();
                    linkedList.add(n);
                    endTime = System.nanoTime();
                    long linkedListAdditionTime = endTime - startTime;

                    int searchElement = n / 2;
                    startTime = System.nanoTime();
                    arrayList.contains(searchElement);
                    endTime = System.nanoTime();
                    long arrayListSearchTime = endTime - startTime;

                    startTime = System.nanoTime();
                    linkedList.contains(searchElement);
                    endTime = System.nanoTime();
                    long linkedListSearchTime = endTime - startTime;

                    System.out.println("Время вставки в ArrayList: " + arrayListInsertionTime + " наносекунд");
                    System.out.println("Время вставки в LinkedList: " + linkedListInsertionTime + " наносекунд");

                    System.out.println("Время удаления из ArrayList: " + arrayListRemovalTime + " наносекунд");
                    System.out.println("Время удаления из LinkedList: " + linkedListRemovalTime + " наносекунд");

                    System.out.println("Время добавления в конец ArrayList: " + arrayListAdditionTime + " наносекунд");
                    System.out.println("Время добавления в конец LinkedList: " + linkedListAdditionTime + " наносекунд");

                    System.out.println("Время поиска в ArrayList: " + arrayListSearchTime + " наносекунд");
                    System.out.println("Время поиска в LinkedList: " + linkedListSearchTime + " наносекунд");
                    break;
            }
        }
    }
}