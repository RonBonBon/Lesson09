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

    public Employee(String firstName, String lastName, String employeeID, String socialID, String department, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.socialID = socialID;
        this.department = department;
        this.phone = phone;
    }

    public static String getString(){

    }
}
