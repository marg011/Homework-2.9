package pro.sky.skyprospringstream.services;

import pro.sky.skyprospringstream.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeBookService {
    String addEmployee(String lastName, String firstName,String patronymicName, int salary,String department);
    Map<String, Employee> getEmployees();

    String printEmployees();

    String removeEmployee(String lastName, String firstName, String patronymicName);

    String findEmployee(String lastName, String firstName, String patronymicName);

    Employee findMaxSalaryByDepartment(String department);
    Employee findMinSalaryByDepartment(String department);
    List<Employee> getEmployeesByDepartment(String department);
    String getEmployeesDepartmentsAll();
}
