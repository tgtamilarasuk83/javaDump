package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Unique Elements in Array
Description : This program reads an array and prints only the unique elements (elements that appear once).
*/

public class UniqueElementArray {

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

        int[] uniqueArray = new int[size];
        int uniqueIndex = 0;

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

            if (count == 0)
                uniqueArray[uniqueIndex++] = array[i];
        }

        System.out.println("Unique Elements:");

        for (int index = 0; index < uniqueIndex; index++) {
            System.out.print(uniqueArray[index] + " ");
        }
    scanf.close();
    }
    
}