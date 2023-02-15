package com.company;

public class Main {

    public static void main(String[] args) {

        Example2 obj = new Example2();
        Example2 obj2 = new Example2(100);
        Example2 obj3 = new Example2(200);
        System.out.println("var1 is : " + obj.getValue());
        System.out.println("var2 is : " + obj.getValue2());
        System.out.println("var1 is : " + obj2.getValue());
        System.out.println("var2 is : " + obj3.getValue());

        Employee sheet = new Employee();
        System.out.println("\n\n\n"+"Name : "+sheet.getName());
        System.out.println("Salary : "+sheet.getSalary());
    }
}
