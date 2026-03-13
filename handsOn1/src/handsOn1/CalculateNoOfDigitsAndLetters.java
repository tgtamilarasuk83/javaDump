package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Count Letters Digits and Symbols
 * Description: This program counts the number of letters, digits, and other symbols in a given string.
 */

import java.util.*;

public class CalculateNoOfDigitsAndLetters {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		String inputText = scanf.nextLine();
		char[] characters = inputText.toCharArray();

		int letterCount = 0, digitCount = 0, symbolCount = 0;

		for (int i = 0; i < characters.length; i++) {

			if ((characters[i] >= 'A' && characters[i] <= 'Z') || (characters[i] >= 'a' && characters[i] <= 'z')) {
				letterCount++;

			} else if (characters[i] - '0' >= 0 && characters[i] - '0' <= 9) {
				digitCount++;

			} else {
				symbolCount++;
			}
		}

		System.out.println("Letters : " + letterCount + " Digits : " + digitCount + " Other Symbols : " + symbolCount);
	}
}