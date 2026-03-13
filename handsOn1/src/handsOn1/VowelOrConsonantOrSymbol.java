package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Vowel Consonant Number or Symbol Check
 * Description: This program checks whether the entered character is a vowel, consonant, number, or symbol.
 */

import java.util.*;

public class VowelOrConsonantOrSymbol {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		char inputChar = scanf.next().toLowerCase().charAt(0);

		switch (inputChar) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("This is Vowel");
			break;

		default:

			if (inputChar >= 'a' && inputChar <= 'z') {
				System.out.println("This is consonant");
			} 
			else if (inputChar >= '0' && inputChar <= '9') {
				System.out.println("This is a number");
			} 
			else {
				System.out.println("This is symbol");
			}
		}
	}
}