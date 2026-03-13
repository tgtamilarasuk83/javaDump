package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Lucky Car Number Check
 * Description: This program checks whether a four-digit car number is lucky based on the sum of its digits.
 */



import java.util.*;

public class LuckNumber {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int carNumber = scanf.nextInt();

		if (carNumber < 1000 || carNumber > 9999) {
			System.out.println("Not a valid car number");
			return;
		}

		int digitSum = 0;

		while (carNumber != 0) {
			digitSum += carNumber % 10;
			carNumber /= 10;
		}

		if (digitSum % 3 == 0 || digitSum % 5 == 0 || digitSum % 7 == 0) {
			System.out.println("Lucky Number");
		} 
		else {
			System.out.println("Not a lucky number");
		}
	}
}