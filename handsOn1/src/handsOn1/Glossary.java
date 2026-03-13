package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Purchase Discount Based on Quantity
 * Description: This program calculates the total price and applies a 15% discount if quantity exceeds 500.
 */

import java.util.*;

public class Glossary {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		System.out.println("Enter the price");
		int price = scanf.nextInt();

		System.out.println("Enter the quantity of purchased items");
		int quantity = scanf.nextInt();

		if (quantity > 500) {

			long total = price * quantity;
			double discount = total * 0.15;

			System.out.println(total - discount);

		} else {

			System.out.println("Same Price " + price * quantity);
		}
	}
}