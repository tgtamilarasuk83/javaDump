package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Maximum and Minimum of Array
Description : This program reads N elements into an array and finds the maximum and minimum values.
*/

public class MaximumOfArray {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanf.nextInt();

        int[] array = new int[size];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        System.out.println("Enter the array elements:");

        for (int index = 0; index < size; index++) {
            array[index] = scanf.nextInt();

            if (array[index] > maximum)
                maximum = array[index];

            if (array[index] < minimum)
                minimum = array[index];
        }

        System.out.println("Maximum element : " + maximum);
        System.out.println("Minimum element : " + minimum);
    }
}