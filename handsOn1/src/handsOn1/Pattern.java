package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Number Pattern Printing
 * Description: This program prints a number pattern where each row displays the row number repeatedly.
 */

import java.util.*;

public class Pattern {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int rows = scanf.nextInt();

		for (int row = 0; row < rows; row++) {

			for (int col = 0; col < row + 1; col++) {
				System.out.print((row + 1) + " ");
			}

			System.out.println();
		} scanf.close();
	}
}
