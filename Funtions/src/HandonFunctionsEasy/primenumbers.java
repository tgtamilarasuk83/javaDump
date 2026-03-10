package HandonFunctionsEasy;
import java.util.*;
public class primenumbers {
	
	static void primeNumber(int num) {
		
		for(int i=2; i<=num; i++) {
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
		System.out.println("Enter a number range from 3 to 100: ");
		int num = scanf.nextInt();
		
		primeNumber(num);
		
		
		
	}

}
