/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
/**
 * Student class that extends Human.
 * Represents a student with a name, age, address, GPA, and credits.
 */
public class Student extends Human {

    /** The student's address */
    protected String address;

    /** The student's current GPA on a 0.0 - 4.0 scale */
    private double gpa;

    /** The number of credits the student has earned */
    protected int credits;

    /**
     * Constructor that passes name and age to Human, and sets credits.
     * @param name    the student's name
     * @param age     the student's age
     * @param credits the number of credits earned
     */
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    /** @return the student's address */
    @Override
    public String getAddress() { return address; }

    /** @param address the new address */
    @Override
    public void setAddress(String address) { this.address = address; }

    /** @return the student's GPA */
    public double getGpa() { return gpa; }

    /** @param gpa the new GPA value */
    public void setGpa(double gpa) { this.gpa = gpa; }

    /** @return the number of credits */
    public int getCredits() { return credits; }

    /**
     * Returns a formatted string with the student's details.
     */
    @Override
    public String toString() {
        return "Student | Name: " + getName() + " | Age: " + getAge()
                + " | Credits: " + credits + " | GPA: " + gpa;
    }
}