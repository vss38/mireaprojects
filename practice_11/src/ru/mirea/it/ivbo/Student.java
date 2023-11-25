package ru.mirea.it.ivbo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student
{
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate)
    {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString(String format)
    {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }
}
