package com.mycompany.csc325_oop_designreview_lab;
/**
 * Freshman is a Student in their first year.
 * They typically have fewer than 30 credits.
 */
public class Freshman extends Student {

    /**
     * Constructor for Freshman.
     *
     * @param name    the student's name
     * @param age     the student's age
     * @param credits the number of credits earned
     */
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    /**
     * Returns a formatted string with the freshman's details.
     */
    @Override
    public String toString() {
        return "Freshman | Name: " + getName() + " | Age: " + getAge()
                + " | Credits: " + credits + " | GPA: " + getGpa();
    }
}

