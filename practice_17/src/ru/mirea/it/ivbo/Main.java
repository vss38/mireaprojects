package ru.mirea.it.ivbo;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Иван", 10.0, 40);
        EmployeeView employeeView = new EmployeeView();
        EmployeeController employeeController = new EmployeeController(employee, employeeView);

        employeeController.updateView();
    }
}