package handsOn1;
/*
 * Author : Tamilarasu K
 * Program: Discount Calculation
 * Description: This program calculates the final amount after applying discount based on purchase amount.
 */

import java.util.*;

public class DiscountCal {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int amount = scanf.nextInt();
		float discount = 0;

		if (amount < 2000) {
			discount = (float) (amount * 0.05);
		} 
		else if (amount >= 2000 && amount < 5000) {
			discount = (float) (amount * 0.25);
		} 
		else if (amount >= 5000 && amount < 10000) {
			discount = (float) (amount * 0.35);
		} 
		else {
			discount = (float) (amount * 0.50);
		}

		System.out.println(amount - discount);
	}
}