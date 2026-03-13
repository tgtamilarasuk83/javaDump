package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Sum Of Digits
 * Description: This program calculates the sum of digits of a given number.
 */

import java.util.*;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int number = scanf.nextInt();
		int digitSum = 0;

		while (number != 0) {
			digitSum += number % 10;
			number /= 10;
		}

		System.out.println(digitSum);
	}
}