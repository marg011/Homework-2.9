package pro.sky.skyprospringstream.model;

import java.util.Objects;

public class Employee {
    private static int id;
    private final int EmployeeId;
    private String lastName;
    private String firstName;
    private String patronymicName;
    private int salary;
    private String department;

    public Employee(String lastName, String firstName, String patronymicName, int salary, String department) {
        this.EmployeeId = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
        id++;
    }

    @Override
    public String toString() {
        return "ID: " + this.EmployeeId + ", last name: " + this.lastName + ", first name: "
                + this.firstName + ", patronymic: " + this.patronymicName
                + ", salary: " + this.salary + ", department: " + this.department;


    }

    public String getFullName(){
        return lastName + " " + firstName + " " + patronymicName;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return EmployeeId == employee.EmployeeId && salary == employee.salary && Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName) && Objects.equals(patronymicName, employee.patronymicName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmployeeId, lastName, firstName, patronymicName, salary, department);
    }
}
