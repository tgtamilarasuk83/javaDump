package handsOn2;

/*
 * Author : Tamilarasu K
 * Program: Duplicate Elements in Array
 * Description: This program finds and prints duplicate numbers present in an array.
 */

import java.util.*;

public class DuplicateOfAnArray {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int size = scanf.nextInt();
		int[] numbers = new int[size];
		boolean[] visited = new boolean[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = scanf.nextInt();
		}

		for (int i = 0; i < size; i++) {

			if (visited[i])
				continue;

			boolean isDuplicate = false;

			for (int j = i + 1; j < size; j++) {

				if (numbers[i] == numbers[j]) {
					isDuplicate = true;
					visited[j] = true;
				}
			}

			if (isDuplicate)
				System.out.println("Duplicate number " + numbers[i]);
		}
	scanf.close();}
	
	
}