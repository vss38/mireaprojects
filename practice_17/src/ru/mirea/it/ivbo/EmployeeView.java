package ru.mirea.it.ivbo;

public class EmployeeView
{
    public void printEmployeeDetails(String name, double hourlyRate, int hoursWorked, double salary)
    {
        System.out.println("Описание сотрудника:");
        System.out.println("Имя: " + name);
        System.out.println("Почасовая ставка: " + hourlyRate);
        System.out.println("Отработанные часы: " + hoursWorked);
        System.out.println("Зарплата: " + salary);
    }
}