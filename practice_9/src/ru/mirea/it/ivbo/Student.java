package ru.mirea.it.ivbo;

public class Student
{
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name)
    {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber()
    {
        return iDNumber;
    }

    public String getName()
    {
        return name;
    }

    public int compareTo(Student student)
    {
        return Integer.compare(this.iDNumber, student.iDNumber);
    }

    public static void insertSort(Student[] students)
    {
        int n = students.length;
        for (int i = 1; i < n; ++i)
        {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber())
            {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}