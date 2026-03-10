package AccountManagementSystem;
import java.util.*;
import java.util.ArrayList;


public class Accountdetails  extends UseraccountManagement {
	
	public static void main(String args[] ){
		
		  ArrayList<Accountdetails> account = new ArrayList<>();
		
		System.err.print("Bank Management System");
		System.err.println("Enter 1  for Account Creation" );
		System.err.println("Enter 2 for Credit Operation");
		System.err.println("Enter 3 for Debit Operation ");
		System.err.println("Enter 4 for Fund Transfer ");	
		System.err.println("Enter 5  for Account Display ");
		System.err.println("Enter -6  for Terminate ");
		
		Scanner scanf = new Scanner(System.in);
		
		
		
		
		
		int choice =0;
		
		do {
			System.err.println("Enter your choice: ");
			   choice = scanf.nextInt();
			if(choice <7 && choice >1) {
				System.out.println("Enter the valid choice");
				continue;
			}
			
			switch(choice) {
			case 1:
				System.out.println("Account creation has been Started :");
				
				 account.add(new UseraccountManagement());
				
				
			
			}
			
			case 2:
				
			
			
		}
		while (choice !=6);
			
		
	}

}
