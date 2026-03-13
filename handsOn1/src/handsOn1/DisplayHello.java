package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Display Hello Multiple Times
 * Description: This program prints "Hello" a specified number of times until a negative number is entered.
 */

import java.util.Scanner;

public class DisplayHello {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		while (true) {

			int count = scanf.nextInt();

			if (count > 0) {
				for (int i = 0; i < count; i++)
					System.out.println("Hello");
			} 
			else {
				System.out.println("Program stopped");
				break;
			}
		}
	}
}