package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Merge Two Arrays
Description : This program reads two arrays and merges them into a single array.
*/

public class MergetoArrays {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = scanf.nextInt();

        System.out.print("Enter size of second array: ");
        int size2 = scanf.nextInt();

        int[] firstArray = new int[size1];
        int[] secondArray = new int[size2];
        int[] mergedArray = new int[size1 + size2];

        System.out.println("Enter elements of first array:");
        for (int index = 0; index < size1; index++) {
            firstArray[index] = scanf.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int index = 0; index < size2; index++) {
            secondArray[index] = scanf.nextInt();
        }

        for (int index = 0; index < size1 + size2; index++) {
            if (index < size1)
                mergedArray[index] = firstArray[index];
            else
                mergedArray[index] = secondArray[index - size1];
        }

        System.out.println("Merged Array:");
        for (int index = 0; index < size1 + size2; index++) {
            System.out.print(mergedArray[index] + " ");
        }
    }
}