package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Internet Browsing Charge
 * Description: This program calculates the internet browsing charge based on hours and minutes used.
 */

import java.util.*;

public class InternetBrowsing {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int hours = scanf.nextInt();
		int originalHours = hours;
		int minutes = scanf.nextInt();
		int totalCharge = 0;

		if (hours <= 7) {

			if (hours >= 5) {
				totalCharge += 200;
				hours = hours - 5;
				totalCharge += hours * 50;
			} 
			else {
				totalCharge += hours * 50;
			}

		} 
		else {
			System.out.println("Fail");
			return;
		}

		if (minutes != 0 && originalHours < 7) {
			totalCharge += minutes;
		} 
		else {
			System.out.println("Fail");
			return;
		}

		System.out.println(totalCharge);
	}
}