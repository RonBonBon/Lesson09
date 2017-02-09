package com.arichafamily.java;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Date;

/**
 * Created by hackeru on 09/02/2017.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String employeeID;
    private String socialID;
    private String department;

    private String phone;

    private Date hireDate;
    private String company;
    private double salary;

    public Employee() {
        this.firstName = getString("Enter First name");
        this.lastName = getString("Enter Last name");
        this.salary = getDouble("Enter Salary");
        this.empID = getInt("Enter Employee ID");
        this.department = setString("Enter Department name");
        this.company = ("Enter Company name");
    }

    public Employee(String firstName, String lastName, double salary, int empID, String department, String company) {
    }

    public void showEmployee(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Your Salary: " + salary);
        System.out.println("Employee ID: " + empID);
        System.out.println("Department: " + department);
        System.out.println("Company: " + company);
    }
}
