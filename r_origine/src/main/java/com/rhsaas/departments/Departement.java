package com.rhsaas.departments;

import java.util.ArrayList;
import java.util.Optional;

import com.rhsaas.staff.Employee;

public class Departement {
    private String refCode;
    private String name;
    private String description;
    private Employee manager;
    private Departement overDepartement;
    private ArrayList<Departement> underDepartments = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();

    public Departement(String refCode, String name, String description, Employee manager) {
        this.refCode = refCode;
        this.name = name;
        this.description = description;
        this.manager = manager;
    }

    public String getRefCode() {
        return this.refCode;
    }

    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getManager() {
        return this.manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Departement getOverDepartment() {
        return this.overDepartement;
    }

    public void setOverDepartment(Departement overDepartement) {
        this.overDepartement = overDepartement;
    }

    public ArrayList<Departement> getUnderDepartements() {
        return this.underDepartments;
    }

    public void setUnderDepartements(ArrayList<Departement> departements) {
        this.underDepartments = departements;
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployeeByIndex(int index) {
        this.employees.remove(index);
    }

    public Employee findDepartmentEmployeeWhereFirstName(String searchName) {
         Optional<Employee> foundName = employees.stream()
                .filter(employee -> employee.getFirstName().equals(searchName))
                .findFirst();

        return foundName.orElse(null);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Department RefCode: ").append(refCode).append("\n");
        stringBuilder.append("Department Name: ").append(name).append("\n");
        stringBuilder.append("Description: ").append(description).append("\n");
        stringBuilder.append("Manager: ").append(manager.getFullName()).append("\n");

        if (overDepartement != null) {
            stringBuilder.append("Over Department: ").append(overDepartement.getName()).append("\n");
        } else {
            stringBuilder.append("Over Department: None\n");
        }

        stringBuilder.append("Under Departments: ");
        if (underDepartments.isEmpty()) {
            stringBuilder.append("None\n");
        } else {
            stringBuilder.append("\n");
            for (Departement underDepartment : underDepartments) {
                stringBuilder.append("- ").append(underDepartment.getName()).append("\n");
            }
        }

        stringBuilder.append("Employees:\n");
        if (employees.isEmpty()) {
            stringBuilder.append("None\n");
        } else {
            for (Employee employee : employees) {
                stringBuilder.append("- ").append(employee.getFullName()).append("\n");
            }
        }

        return stringBuilder.toString();
    }
}