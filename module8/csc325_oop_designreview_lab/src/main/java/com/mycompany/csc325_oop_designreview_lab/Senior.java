package com.mycompany.csc325_oop_designreview_lab;
/**
 * Senior is a Student with at least 85 credits.
 */
public class Senior extends Student {

    /** Minimum credits required to be a Senior */
    private static final int MIN_CREDITS = 85;


    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        if (credits < MIN_CREDITS) {
            throw new IllegalArgumentException(
                    "A Senior must have at least " + MIN_CREDITS + " credits."
            );
        }
    }

    /**
     * Returns a formatted string with the senior's details.
     */
    @Override
    public String toString() {
        return "Senior  | Name: " + getName() + " | Age: " + getAge()
                + " | Credits: " + credits + " | GPA: " + getGpa();
    }
}
