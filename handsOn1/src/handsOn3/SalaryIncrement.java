package handsOn3;

/*
 * Author  : Tamilarasu K
 * Program : Salary Increment Based on Rating
 * Description : Calculates the new salary based on performance rating
 */

import java.util.*;



public class SalaryIncrement {

    static void calculateRating(int sal, float rating) {
        if (sal <= 0 || rating < 1 || rating > 10) {
            System.out.println("Invalid Input");
            return;
        }

        if (rating >= 1 && rating <= 4) {
            System.out.println(sal + (sal * 0.10));
        } else if (rating > 4 && rating <= 7) {
            System.out.println(sal + (sal * 0.25));
        } else {
            System.out.println(sal + (sal * 0.30));
        }
    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int sal = scanf.nextInt();

        System.out.print("Enter rating: ");
        float rating = scanf.nextFloat();

        calculateRating(sal, rating);
    }
}