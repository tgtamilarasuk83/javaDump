package handsOn2;

/*
 * Author : Tamilarasu K
 * Program: Frequency Of Each Element
 * Description: This program calculates and displays the frequency of each element in an array.
 */

import java.util.*;

public class FrequencyOfEachElement {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int size = scanf.nextInt();
		int[] numbers = new int[size];
		boolean[] visited = new boolean[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = scanf.nextInt();
		}

		for (int i = 0; i < size; i++) {

			int count = 0;

			if (visited[i])
				continue;

			for (int j = 0; j < size; j++) {

				if (numbers[i] == numbers[j]) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println(numbers[i] + " : " + count);
		}
	}
}