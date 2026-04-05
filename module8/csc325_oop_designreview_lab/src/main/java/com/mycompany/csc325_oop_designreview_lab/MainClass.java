/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 Freshman std1 = new Freshman("James", (short) 20, 12);


	 Senior std2 = new Senior("John", (short) 30, 90);

	 // ToDo 12: Use Scanner to get GPA input from the user
	 Scanner scanner = new Scanner(System.in);

	 System.out.print("Enter GPA for " + std1.getName() + ": ");
	 std1.setGpa(scanner.nextDouble());

	 System.out.print("Enter GPA for " + std2.getName() + ": ");
	 std2.setGpa(scanner.nextDouble());

	 scanner.close();

	 // Print the toString output for each student (ToDo 9, 10, 11)
	 System.out.println(std1);
	 System.out.println(std2);
 }

}

