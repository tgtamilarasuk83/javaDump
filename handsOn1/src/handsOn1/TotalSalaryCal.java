package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Total Salary Calculation
 * Description: This program calculates the total salary of an employee based on per day salary and number of days worked.
 */

import java.util.Scanner;

public class TotalSalaryCal {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		System.out.println("Enter the Employee Name");
		String empName = scanf.nextLine();

		System.out.println("Enter the Employee ID");
		String empId = scanf.next();

		System.out.println("Enter the per day salary");
		int dailySalary = scanf.nextInt();

		System.out.println("Enter total number of days worked");
		int workDays = scanf.nextInt();

		System.out.println("Employee Details");
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee salary per day : " + dailySalary);
		System.out.println("Total number of days worked : " + workDays);
		System.out.println("Employee total salary : " + (workDays * dailySalary));
	}
}