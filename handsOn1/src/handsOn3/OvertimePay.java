package handsOn3;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Overtime Pay Calculation
Description : This program calculates the overtime salary for 5 employees.
              Employees are paid ₹15 for every hour worked beyond 40 hours.
*/

public class OvertimePay {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int overtimeLimit = 40;
        int overtimeRate = 15;

        for (int employee = 1; employee <= 5; employee++) {

            System.out.print("Enter the working hours of employee " + employee + " : ");
            int hoursWorked = scanf.nextInt();

            int overtimeSalary = 0;

            if (hoursWorked > overtimeLimit) {
                overtimeSalary = (hoursWorked - overtimeLimit) * overtimeRate;
            }

            System.out.println("Overtime salary of employee " + employee + " : " + overtimeSalary);
        }
    }
}