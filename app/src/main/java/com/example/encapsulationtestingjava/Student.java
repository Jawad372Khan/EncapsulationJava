package com.example.encapsulationtestingjava;

import java.util.HashSet;
import java.util.Set;

public class Student{
    private String name;
    private String grade;
    private static final Set<String> validGrades;

    static {
        validGrades = new HashSet<>();
        validGrades.add("A");
        validGrades.add("B");
        validGrades.add("C");
        validGrades.add("D");
        validGrades.add("F");
    }

    public Student(String name, String grade) {
        this.name = name;
        if (validGrades.contains(grade)) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Invalid Grade");
        }
    }

    public void set(String stdName, String stdGrade) {
        this.name = stdName;
        if (validGrades.contains(stdGrade)) {
            this.grade = stdGrade;
            System.out.println("Name: " + name + ", Grade: " + grade);
        } else {
            throw new IllegalArgumentException("Invalid Grade");
        }
    }

    public void gets() {
        if (validGrades.contains(grade)) {
            System.out.println("Name: " + name + ", Grade: " + grade);
        } else {
            throw new IllegalArgumentException("Invalid Grade");
        }
    }
}