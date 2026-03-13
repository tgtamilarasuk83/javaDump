package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Bubble Sort
Description : This program sorts an array of integers in ascending order using the Bubble Sort algorithm.
*/

public class Sorting {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanf.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements:");

        for (int index = 0; index < size; index++) {
            array[index] = scanf.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int index = 0; index < size; index++) {
            System.out.print(array[index] + " ");
        }
    }
}