package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Typing Pages Cost
 * Description: This program calculates the total typing cost based on number of pages and copies.
 */

import java.util.*;

public class TypingPages {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		System.out.println("Enter the number of pages");
		int pages = scanf.nextInt();

		System.out.println("Enter number of copies");
		int copies = scanf.nextInt();

		if (copies == 0) {
			System.out.println(pages * 3);
			return;
		} 
		else if (pages == 0) {
			System.out.println("Type some pages");
			return;
		}

		int totalCost = (pages * 3) + pages * 3 * (copies - 1) + pages;

		System.out.println(totalCost);
	}
}