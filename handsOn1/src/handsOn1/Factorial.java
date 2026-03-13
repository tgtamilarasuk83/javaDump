package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Factorial Divisor Check
 * Description: This program checks the factorial value and prints the factorial number for the given input.
 */

import java.util.*;

public class Factorial {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int number = scanf.nextInt();
		int divisor = 1;
		int tempValue = number;

		while (tempValue > 1) {

			if (tempValue % divisor != 0) {
				System.out.println("This is not a factorial divisor");
				return;
			}

			tempValue /= divisor;
			divisor++;
		}

		System.out.println(divisor - 1);
	}
}