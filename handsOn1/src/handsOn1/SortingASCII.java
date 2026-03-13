package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: ASCII Character Sorting
 * Description: This program sorts the characters of a string based on their ASCII values.
 */

import java.util.*;

public class SortingASCII {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		String text = scanf.nextLine();
		char[] chars = text.toCharArray();

		Arrays.sort(chars);

		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
	}
}