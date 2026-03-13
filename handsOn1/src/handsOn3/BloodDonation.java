package handsOn3;


import java.util.*;

/*
Author : Tamilarasu K
Program Title : Blood Donation Eligibility
Description : This program checks whether a person is eligible to donate blood
              based on age and weight conditions.
*/

public class BloodDonation {

    static void checkEligibility(int age, int weight) {

        if ((age >= 18 && age <= 55) && (weight > 45)) {
        	
            System.out.println("You are eligible to donate blood.");
        } else {
        	
            System.out.println("You are not eligible to donate blood.");
        }
    }

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter the age of donor: ");
        int age = scanf.nextInt();

        System.out.print("Enter the weight of donor: ");
        int weight = scanf.nextInt();

        checkEligibility(age, weight);
    }
}