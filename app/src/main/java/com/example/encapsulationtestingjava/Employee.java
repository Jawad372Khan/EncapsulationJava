package com.example.encapsulationtestingjava;

public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Invalid Salary Amount");
        }
    }

    public void get() {
        if (salary > 0) {
            System.out.println("Employee Name: " + name + ", Employee Position: " + position + ", Employee Salary: " + salary);
        } else {
            throw new IllegalArgumentException("Invalid Salary Amount");
        }
    }

    public void set(String empName, String empPosition, int empSalary) {
        this.name = empName;
        this.position = empPosition;
        if (empSalary > 0) {
            this.salary = empSalary;
            System.out.println("Employee Name: " + name + ", Employee Position: " + position + ", Employee Salary: " + salary);
        } else {
            throw new IllegalArgumentException("Invalid Salary Amount");
        }
    }

    // Getter methods for name, position, and salary
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}