package com.teksystems;

public class Manager extends Employee {
    public Manager(long id, String name, String address, long phone, double salary)  {
        super(id, name, address, phone);
        super.basicSalary = calculateSalary(salary) * 1.15;
    }

}
