package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Purchase Discount Calculation
 * Description: This program calculates the total payable amount after applying discount based on purchase value.
 */



import java.util.*;

public class Calculations {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int quantity = scanf.nextInt();
		int pricePerItem = scanf.nextInt();

		int totalAmount = quantity * pricePerItem;
		int discount = 0;

		if (totalAmount >= 1000) {
			discount = (int) (totalAmount * 0.10);
		} else {
			discount = (int) (totalAmount * 0.05);
		}

		System.out.println("Total amount: " + (totalAmount - discount));
	}
}