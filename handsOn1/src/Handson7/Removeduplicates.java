package Handson7;
/*
Author: Tamilarasu
Program Title: Remove Duplicate Characters
Description: This program removes duplicate characters from a string while maintaining order.
*/

import java.util.*;
import java.lang.*;

public class Removeduplicates {
	public static void main(String args[]) {
		
		Scanner scanf = new Scanner(System.in);
		
		 System.out.println("Enter a string to remove the duplicate :");
		String str = scanf.nextLine();
		
		
		// LinkedHashSet - maintains order
		 LinkedHashSet<Character> character = new LinkedHashSet<>();
		
		 for(char X : str.toCharArray()) {
			 character.add(X);
		 }
		 

		 for(char X : character) {
			 System.out.print(X);
			
		 }
		 
		
		
			}
}
