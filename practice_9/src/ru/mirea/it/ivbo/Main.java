package ru.mirea.it.ivbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int ch;
        System.out.println("Практическая работа №9\n\n0 - выход\n1-4 - номер работы\n");

        while (true) {
            System.out.print("Введите команду: ");
            ch = myscanner.nextInt();
            switch (ch) {
                case (0):
                    return;
                case (1):
                    System.out.println("Открыт пункт №1");

                    Student[] students = new Student[5];
                    students[0] = new Student(102, "Алексей");
                    students[1] = new Student(101, "Иван");
                    students[2] = new Student(105, "Мария");
                    students[3] = new Student(104, "Екатерина");
                    students[4] = new Student(103, "Андрей");

                    Student.insertSort(students);

                    for (int i = 0; i < students.length; ++i)
                    {
                        System.out.println("ID: " + students[i].getIDNumber() + ", Name: " + students[i].getName());
                    }
                    break;
                case (2):
                    System.out.println("Открыт пункт №2");

                    List<Student> students2 = new ArrayList<>();
                    students2.add(new Student(85,"Алексей"));
                    students2.add(new Student(72, "Мария"));
                    students2.add(new Student(89,"Иван"));
                    students2.add(new Student(67,"Екатерина"));
                    students2.add(new Student(91,"Андрей"));

                    SortingStudentsByGPA.quickSort(students2, 0, students2.size() - 1);

                    for (Student student : students2) {
                        System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
                    }
                    break;
                case (3):
                    System.out.println("Открыт пункт №3");

                    Student[] students3 = new Student[6];
                    students3[0] = new Student(102,"Алексей");
                    students3[1] = new Student(105, "Мария");
                    students3[2] = new Student(101,"Иван");
                    students3[3] = new Student(104,"Екатерина");
                    students3[4] = new Student(103,"Андрей");
                    students3[5] = new Student(106,"Александр");

                    Student[] mergedList = MergeSort.sortArray(students3);

                    for (Student student : mergedList) {
                        System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
                    }
                    break;
                case (4):
                    System.out.println("Открыт пункт №4");

                    Person[] persons = new Person[3];
                    persons[0] = new Person("Алексей",20);
                    persons[1] = new Person("Мария", 17);
                    persons[2] = new Person("Иван",19);

                    for (Person person : persons) {
                        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
                    }

                    break;
            }
        }
    }
}