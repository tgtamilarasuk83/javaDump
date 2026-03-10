package HandonFunctionsEasy;

import java.util.Scanner;

public class VoterEligibiluty {
	
static void Voter(int age) {
		
		if(age <= 18)
		 System.out.println("Not Eligiblr for vote");
		
		else
			 System.out.println(" Eligiblr for vote");
	    }
	public static void main(String args[]) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = scanf.nextInt();
		
		Voter(age);
	}

}
