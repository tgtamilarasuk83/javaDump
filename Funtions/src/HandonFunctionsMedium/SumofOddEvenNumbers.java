package HandonFunctionsMedium;

import java.util.Scanner;

public class SumofOddEvenNumbers {
	
	static int even = 0;
	static int odd  = 0;
	public static void evenORodd(int num){
		
		
		for(int i=1 ; i<=num ; i++) {
			if((i % 2)==0) {
				
				even += i;
				
			}
			else {
				
				odd += i;
			}
		}
		
		
	}
	
	public static void main(String args[]) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Enter the Range of the Number: ");
		
		int num = scanf.nextInt();
		
		evenORodd(num);
		
		System.out.println("The sum of even numbers from 1 to "+ num +"is "+even);
		System.out.println("The sum of odd numbers from  1 to "+ num +"is "+odd);
		
		int absolute = odd -even;
		
		if(absolute <0) {
			absolute=+absolute*-1;
		}
		System.out.println("The absolute difference between the two sums is: " +absolute);
		
		
		
		
	}
}
