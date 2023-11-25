package ru.mirea.it.ivbo;

public class Student
{
    private String name;
    private String surname;
    private String specialization;
    private int course;
    private int group;
    private int iDNumber;
    private double gpa;

    public Student(int iDNumber,double gpa)
    {
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }
    public Student(String name, String surname, String specialization, int course, int group)
    {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    public int getCourse()
    {
        return course;
    }

    public void setCourse(int course)
    {
        this.course = course;
    }

    public int getGroup()
    {
        return group;
    }

    public void setGroup(int group)
    {
        this.group = group;
    }

    public int getIDNumber()
    {
        return iDNumber;
    }

    public double getGPA() {
        return gpa;
    }

    public int compareTo(Student student)
    {
        return Integer.compare(this.iDNumber, student.iDNumber);
    }
}
