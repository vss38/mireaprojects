package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №10\n\n0 - выход\n1-3 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №1");

                    Student student1 = new Student("Вячеслав", "Столяров", "Программист", 2, 1);

                    System.out.println("Имя: " + student1.getName());
                    System.out.println("Фамилия: " + student1.getSurname());
                    System.out.println("Специальность: " + student1.getSpecialization());
                    System.out.println("Курс: " + student1.getCourse());
                    System.out.println("Группа: " + student1.getGroup());
                    break;
                case (2):
                    System.out.println("Открыт пункт №2");

                    SortingStudentsByGPA tester = new SortingStudentsByGPA();

                    Student[] students = {
                            new Student(1, 3.8),
                            new Student(3, 4.0),
                            new Student(2, 3.5),
                            new Student(4, 3.9)
                    };

                    tester.setArray(students);
                    System.out.println("До сортировки:");
                    tester.outArray();

                    tester.quicksort();
                    System.out.println("\nCортировка по GPA:");
                    tester.outArray();

                    tester.sortByOtherField();
                    System.out.println("\nCортировка по ID:");
                    tester.outArray();
                    break;
                case (3):
                    System.out.println("Открыт пункт №3");

                    Student[] students3 = new Student[6];
                    students3[0] = new Student(2,3.2);
                    students3[1] = new Student(5, 4.6);
                    students3[2] = new Student(1,4.1);
                    students3[3] = new Student(4,3.7);
                    students3[4] = new Student(3,4.2);
                    students3[5] = new Student(6,3.4);

                    Student[] mergedList = MergeSort.sortArray(students3);

                    for (Student student : mergedList) {
                        System.out.println("ID: " + student.getIDNumber() + ", GPA: " + student.getGPA());
                    }
                    break;
            }
        }
    }
}