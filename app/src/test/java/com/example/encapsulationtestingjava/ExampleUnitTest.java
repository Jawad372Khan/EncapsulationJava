package com.example.encapsulationtestingjava;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);

    }
    @Test
    public void main() {
        // Bank Account Test
        BankAccount bankAccount = new BankAccount(1000.0);

        // Deposit
        double depositBalance = 3000.0;
        bankAccount.deposit(depositBalance);

        // Withdraw
        double withdrawBalance = 500.0;
        bankAccount.withdraw(withdrawBalance);

        // Car Test
        Car car = new Car("Kie", "Forte", 41);
        car.get();

        String carMake = "Subaru Car";
        String carModel = "Impreza";
        int carMileage = 54;
        car.set(carMake, carModel, carMileage);

        // Employee Test
        Employee employee = new Employee("Zaman", "HR", 2000);
        employee.get();

        String employeeName = "Ashfaq";
        String employeePosition = "Android Developer";
        int employeeSalary = 50000;
        employee.set(employeeName, employeePosition, employeeSalary);

        // Product Test
        Product product = new Product("Cold Drink", 300.0);
        product.get();

        String productName = "Biscuit";
        double productPrice = 20.0;
        product.set(productName, productPrice);

        // Student Test
        Student student = new Student("Jawad", "A");
        student.gets();

        String stdName = "Usman";
        String stdGrade = "C";
        student.set(stdName, stdGrade);
    }
}