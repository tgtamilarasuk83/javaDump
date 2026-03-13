package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Merge Three Arrays and Sort
Description : This program reads three arrays, merges them into a single array, and sorts the merged array.
*/

public class Merge3Arrays {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = scanf.nextInt();

        System.out.print("Enter size of second array: ");
        int size2 = scanf.nextInt();

        System.out.print("Enter size of third array: ");
        int size3 = scanf.nextInt();

        int[] firstArray = new int[size1];
        int[] secondArray = new int[size2];
        int[] thirdArray = new int[size3];

        System.out.println("Enter elements of first array:");
        for (int index = 0; index < size1; index++) {
        	
            firstArray[index] = scanf.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int index = 0; index < size2; index++) {
        	
            secondArray[index] = scanf.nextInt();
        }

        System.out.println("Enter elements of third array:");
        for (int index = 0; index < size3; index++) {
        	
            thirdArray[index] = scanf.nextInt();
        }

        int[] mergedArray = new int[size1 + size2 + size3];

        for (int index = 0; index < size1 + size2 + size3; index++) {

            if (index < size1)
            	
                mergedArray[index] = firstArray[index];

            else if (index < size1 + size2)
            	
                mergedArray[index] = secondArray[index - size1];

            else
                mergedArray[index] = thirdArray[index - size1 - size2];
        }

        Arrays.sort(mergedArray);

        System.out.println("Merged and Sorted Array:");
        
        for (int value : mergedArray) {
        	
        	
            System.out.print(value + " ");
        }
    }
}