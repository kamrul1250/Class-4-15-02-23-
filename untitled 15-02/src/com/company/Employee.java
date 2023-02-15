package com.company;

public class Employee {
    private double salary;
    private String name;

    public Employee() {
        this.name = "Anik";
        this.salary = 5080090;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}