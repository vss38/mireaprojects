package ru.mirea.it.ivbo;

public class Person
{
    private String name;
    private String surname;
    private String middleName;
    private boolean check = true;

    public Person(String name, String surname, String middleName)
    {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }
    public Person(String surname)
    {
        this.surname = surname;
        check = false;
    }

    public String getFullname()
    {
        String result;
        if (check)
            result = this.surname + " " + this.name + " " + this.middleName;
        else result = this.surname;
        return result;
    }
}
