package ru.mirea.it.ivbo;

import java.util.*;

public class SortingStudentsByGPA
{
    private Student[] students;

    public void setArray(Student[] students)
    {
        this.students = students;
    }

    public void quicksort()
    {
        Comparator<Student> comparator = new Comparator<Student>()
        {
            @Override
            public int compare(Student s1, Student s2)
            {
                return Double.compare(s2.getGPA(), s1.getGPA());
            }
        };

        Arrays.sort(students, comparator);
    }

    public void outArray()
    {
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", GPA: " + student.getGPA());
        }
    }

    public void sortByOtherField()
    {
        Comparator<Student> comparator = new Comparator<Student>()
        {
            @Override
            public int compare(Student s1, Student s2)
            {
                return Integer.compare(s1.getIDNumber(), s2.getIDNumber());
            }
        };

        Arrays.sort(students, comparator);
    }
}
