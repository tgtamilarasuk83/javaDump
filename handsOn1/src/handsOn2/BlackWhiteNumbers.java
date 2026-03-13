package handsOn2;

/*
 * Author : Tamilarasu K
 * Program: Black White Numbers
 * Description: This program replaces numbers based on divisibility by 7 and 8.
 */

import java.util.*;

public class BlackWhiteNumbers {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int[] numbers = new int[100];
		int count = 0;

		while (true) {
			numbers[count++] = scanf.nextInt();

			if (numbers[count - 1] < 0) {
				break;
			}
		}

		for (int i = 0; i < count; i++) {

			if (numbers[i] % 7 == 0 && numbers[i] % 8 == 0) {
				numbers[i] = -6;   // divisible by both 7 and 8
			} 
			else if (numbers[i] % 7 == 0) {
				numbers[i] = -2;   // divisible by 7
			} 
			else if (numbers[i] % 8 == 0) {
				numbers[i] = -9;   // divisible by 8
			}
		}

		for (int i = 0; i < count - 1; i++) {
			System.out.println(numbers[i]);
		}
	}
}