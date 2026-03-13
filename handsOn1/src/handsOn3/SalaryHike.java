package handsOn3;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Salary Hike Calculator
Description : This program calculates the updated salary after applying a given hike percentage.
*/

public class SalaryHike {

    static void calculateSalary(int salary, double hikePercent) {

        double updatedSalary = salary + (salary * hikePercent / 100);

        System.out.println("Salary after hike : " + updatedSalary);
    }

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter the salary : ");
        int salary = scanf.nextInt();

        System.out.print("Enter the hike percentage : ");
        double hikePercent = scanf.nextDouble();

        calculateSalary(salary, hikePercent);
    }
}