package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Gross Salary Calculation
 * Description: This program calculates the gross salary by adding HRA and DA based on the basic salary.
 */

import java.util.*;

public class GrossSalary {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int basicSalary = scanf.nextInt();

		int hra = 0, da = 0;

		if (basicSalary <= 10000) {
			hra = (int) (basicSalary * 0.2);
			da = (int) (basicSalary * 0.8);
		} 
		else if (basicSalary > 10000 && basicSalary <= 20000) {
			hra = (int) (basicSalary * 0.25);
			da = (int) (basicSalary * 0.9);
		} 
		else {
			hra = (int) (basicSalary * 0.3);
			da = (int) (basicSalary * 0.95);
		}

		System.out.println("Gross Salary " + (basicSalary + hra + da));
	}
}