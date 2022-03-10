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
            System.out.println(" ");
        }
    }

    //UC2: Calculating Daily Employee Wage
    public void dailyWage() {
        // Check the employee is present or absent
        int IS_FULL_TIME = 1;
        // Calculating daily employee wage
        final int empWagePerHrs = 20;
        int empHrs = 0;
        int empWage = 0;

        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Employee is Present");
        } else {

            empHrs = 0;
            System.out.println("Employee is Absent");
        }
        empWage = empHrs * empWagePerHrs;
        System.out.println("The Daily Wage of the Employee is :" + " " + empWage);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        OopsEmployeeWage object = new OopsEmployeeWage();
        object.welcome();
        object.dailyWage();
    }
}
