package handsOn2;
/*
 * Author : Tamilarasu K
 * Program: Frequency Of Elements in Fixed Array
 * Description: This program calculates and displays the frequency of each element in a predefined array.
 */

import java.util.*;

public class FrequencyOfTennaArray {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int[] numbers = {10, 10, 10, 10, 20, 20, 20, 20, 40, 40, 50, 50, 30};
		boolean[] visited = new boolean[numbers.length];

		for (int i = 0; i < numbers.length; i++) {

			int count = 0;

			if (visited[i])
				continue;

			for (int j = 0; j < numbers.length; j++) {

				if (numbers[i] == numbers[j]) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println(numbers[i] + " : " + count);
		}
	}
}