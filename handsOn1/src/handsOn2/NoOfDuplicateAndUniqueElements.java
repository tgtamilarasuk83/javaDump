package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Count Duplicate and Unique Elements
Description : This program counts the number of duplicate elements and unique elements in an array.
*/

public class NoOfDuplicateAndUniqueElements {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanf.nextInt();

        int[] array = new int[size];
        boolean[] visited = new boolean[size];

        System.out.println("Enter array elements:");

        for (int index = 0; index < size; index++) {
            array[index] = scanf.nextInt();
        }

        int duplicateCount = 0;
        int uniqueCount = 0;

        for (int i = 0; i < size; i++) {

            if (visited[i])
                continue;

            int count = 0;

            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 0)
                duplicateCount++;
            else
                uniqueCount++;
        }

        System.out.println("Number of duplicate elements : " + duplicateCount);
        System.out.println("Number of unique elements    : " + uniqueCount);
    }
}