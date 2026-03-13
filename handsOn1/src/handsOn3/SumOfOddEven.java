package handsOn3;

/*
 * Author  : Tamilarasu K
 * Program : Sum of Odd and Even Numbers
 * Description : Calculates the sum of odd and even numbers in an array
 */

import java.util.*;

public class SumOfOddEven {

    static void sum(int[] arr) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {  
            	
                evenSum += arr[i];  
                
            } else {
            	
                oddSum += arr[i];       
            }
        }

        System.out.println("Even Sum : " + evenSum);
        System.out.println("Odd Sum  : " + oddSum);
    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanf.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanf.nextInt();
        }

        sum(arr);
    }
}