package com.teksystems;

public class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double Hra = 1000.50;

    public Employee() {
        basicSalary = this.calculateSalary();
    }

    public Employee(long id, String name, String address, long phone) {
         employeeId = id;
         employeeName = name;
         employeeAddress = address;
         employeePhone = phone;
    }

    public void calculateSalary(double salary) {
        System.out.println(basicSalary + basicSalary * (specialAllowance / 100) + basicSalary * (Hra / 100));
    }
}
