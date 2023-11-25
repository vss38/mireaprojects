package ru.mirea.it.ivbo;

import java.util.Date;

public class AssignmentDeadline
{
    public AssignmentDeadline(String surname)
    {
        System.out.println("Фамилия разработчика: " + surname);

        Date startDate = new Date();
        System.out.println("Дата и время получения задания: " + startDate);

        Date endDate = new Date(System.currentTimeMillis());
        System.out.println("Дата и время сдачи задания: " + endDate);
    }
}
