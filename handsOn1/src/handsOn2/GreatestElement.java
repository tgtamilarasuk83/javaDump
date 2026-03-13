package handsOn2;
import java.util.*;

/*
Author : Tamilarasu K
Program Title : Greatest Element in 2D Array
Description : This program reads a 3x3 matrix from the user and finds the greatest element in the array.
*/

public class GreatestElement {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int[][] array = new int[3][3];

        System.out.println("Enter 9 elements for the 3x3 matrix:");

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                array[row][column] = scanf.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (array[row][column] > max) {
                    max = array[row][column];
                }
            }
        }

        System.out.println("Greatest Element in the 2D Array is : " + max);
    }
}
