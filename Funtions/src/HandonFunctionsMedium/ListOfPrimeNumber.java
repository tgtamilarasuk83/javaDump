package HandonFunctionsMedium;

import java.util.Scanner;

public class ListOfPrimeNumber {
static void primeNumber(int num,int num1) {
		
		for(int i=num; i<=num1; i++) {
			boolean isPrime = true;
			
			for(int j=2; j<=i/2; j++) {
				if((i % j ) ==0) {
					isPrime = false;
                    break;
				}
				
			}
				if(isPrime) {
	                System.out.println(i);
	            }
			}
			
		}
		
	
	
	public static void main(String args[]) {
		
		Scanner scanf = new Scanner(System.in);
		System.out.println("Enter a number Starting Range ");
		int num = scanf.nextInt();
		System.out.println("Enter a number Ending Range ");
		int num2 = scanf.nextInt();
		primeNumber(num,num2);
}
	
}
