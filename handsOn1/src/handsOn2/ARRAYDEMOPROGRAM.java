package handsOn2;

/*
 * Author : Tamilarasu K
 * Program: Array Element Search
 * Description: This program checks whether a given element exists in the array and counts its occurrences.
 */

import java.util.*;

public class ARRAYDEMOPROGRAM {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int size = 25;
		int[] numbers = new int[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = scanf.nextInt();
		}

		int key = scanf.nextInt();
		int count = 0;

		for (int i = 0; i < size; i++) {
			if (numbers[i] == key)
				count++;
		}

		if (count > 0)
			System.out.println("The element is found and repeated time : " + count);
		else
			System.out.println("Item is not found");
	}
}