package com.mycompany.employee;

public interface Employee {
    int getID();

    String getFirstName();

    String getLastName();

    String getName();

    int getSalary();

    void setSalary(int salary);

    int getAnnualSalary();

    int raiseSalary(int percent);
}
