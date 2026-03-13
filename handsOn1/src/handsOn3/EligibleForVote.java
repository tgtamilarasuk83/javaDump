package handsOn3;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Voting Eligibility Checker
Description : This program checks whether a person is eligible to vote based on age.
*/

public class EligibleForVote {

    static boolean isEligible(int age) {

        if (age >= 18) {  
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanf.nextInt();

        if (isEligible(age)) {
            System.out.println("Yes, the person is eligible to vote.");
        } else {
            System.out.println("No, the person is not eligible to vote.");
        }
    }
}