package com.mycompany.employee;

public class EmployeeImpl implements Employee {

    private int id;
    private String firstname;
    private String lastName;
    private int salary;

    public EmployeeImpl(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstname = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getName() {
        return firstname + " " + lastName;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getAnnualSalary() {
        return salary * 12;
    }

    @Override
    public int raiseSalary(int percent) {
        this.salary += (salary * percent) / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";

    }
}
