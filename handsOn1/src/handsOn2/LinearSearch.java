package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Linear Search
Description : This program reads an array of integers and searches for a given key element using Linear Search.
*/

public class LinearSearch {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanf.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the array elements:");
        for (int index = 0; index < size; index++) {
            array[index] = scanf.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = scanf.nextInt();

        for (int index = 0; index < size; index++) {
            if (array[index] == key) {
                System.out.println("Element found : true");
                return;
            }
        }

        System.out.println("Element found : false");
    }
}