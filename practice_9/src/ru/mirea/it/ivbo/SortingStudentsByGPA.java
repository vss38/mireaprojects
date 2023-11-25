package ru.mirea.it.ivbo;

import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student>
{

    @Override
    public int compare(Student student1, Student student2)
    {
        return Double.compare(student2.getIDNumber(), student1.getIDNumber());
    }

    public static void quickSort(List<Student> students, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(students, low, high);

            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    public static int partition(List<Student> students, int low, int high)
    {
        double pivot = students.get(high).getIDNumber();
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (students.get(j).getIDNumber() > pivot)
            {
                i++;

                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }
}
