package HandonFunctionsEasy;
import java.util.Scanner;

public class SumofOddEvenNumbers {
	
	static int even = 0;
	static int odd  = 0;
	public static void evenORodd(int num){
		
		
		for(int i=1 ; i<=num ; i++) {
			if((i % 2)==0) {
				
				even+= i;
			}
			else {
				
				odd+= i;
			}
		}
		
		
	}
	
	public static void main(String args[]) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Enter the Range of the Number: ");
		
		int num = scanf.nextInt();
		
		evenORodd(num);
		
		System.out.println(even);
		System.out.println(odd);
		
		
		
		
		
	}
}
