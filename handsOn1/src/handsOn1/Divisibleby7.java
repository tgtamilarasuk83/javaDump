package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Divisible by 7 Check
 * Description: This program checks whether the entered number is divisible by 7.
 */

import java.util.Scanner;

public class Divisibleby7 {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int number = scanf.nextInt();

		if (number % 7 == 0) {
			System.out.println("The number is divisible by 7");
		} 
		else {
			System.out.println("The number is not divisible by 7");
		}
	}
}