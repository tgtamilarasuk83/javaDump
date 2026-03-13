package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Blood Donor Eligibility
 * Description: This program checks whether a person is eligible to donate blood based on age and weight.
 */



import java.util.*;

public class BloodDonar {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		System.out.println("Enter the age:");
		int donorAge = scanf.nextInt();

		System.out.println("Enter the weight:");
		int donorWeight = scanf.nextInt();

		if ((donorAge > 18 && donorAge < 55) && (donorWeight > 45)) {
			System.out.println("You are eligible to donate blood");
		} else {
			System.out.println("You are not eligible to donate blood");
		}
	}
}
