package handsOn2;

/*
 * Author : Tamilarasu K
 * Program: Equal Sharing Check
 * Description: This program checks whether the given values can be equally shared.
 */

import java.util.*;

public class EqualSharing {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int size = scanf.nextInt();
		int[] values = new int[size];

		for (int i = 0; i < size; i++) {
			values[i] = scanf.nextInt();
		}

		int total = 0;

		for (int i = 0; i < size; i++) {
			total += values[i];
		}

		if (total % size == 0) {
			System.out.println("Yes");
		} 
		else {
			System.out.println("No");
		}
	}
}