package com.mycompany.employee;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeImpl employee = (EmployeeImpl) o;
        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(firstname, employee.firstname) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastName, salary);
    }
}
