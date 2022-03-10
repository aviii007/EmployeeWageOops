package com.java.employeeWageDay8;

public class OopsEmployeeWage {
    public void welcome() {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        // UC1: Checking if the employee is present or absent
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        OopsEmployeeWage object = new OopsEmployeeWage();
        object.welcome();
    }
}
