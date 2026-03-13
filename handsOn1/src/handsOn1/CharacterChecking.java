package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Character Type Check
 * Description: This program checks whether the entered character is a digit, alphabet, or symbol.
 */

import java.util.*;

public class CharacterChecking {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		char inputCharacter = scanf.next().toLowerCase().charAt(0);

		if (inputCharacter >= '0' && inputCharacter <= '9') {
			System.out.println("This is number");
		} 
		else if (inputCharacter >= 'a' && inputCharacter <= 'z') {
			System.out.println("This is alphabet");
		} 
		else {
			System.out.println("This is symbol");
		}
	}
}