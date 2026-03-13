package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Sum Using Do-While Loop
 * Description: This program calculates the sum of numbers from 1 to the given number using a do-while loop.
 */

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int limit = scanf.nextInt();
		int sum = 0;
		int num = 1;

		do {
			sum += num;
			num++;
		} while (limit >= num);

		System.out.println(sum);
	}
}