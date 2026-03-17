package Handson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistlenght5 {
	public static void main(String args[]) {
		
		ArrayList<String> Str = new ArrayList<String>();
		
		System.out.println("Enter the no of names to add :");
		
		Scanner scanf = new Scanner(System.in);
	    int count = scanf.nextInt();
	    scanf.nextLine();
	    String name ;
		for(int i=1; i<=count ; i++) {
			System.out.println("Enter the no of name :"+ i);
			 name = scanf.nextLine();
	            Str.add(name);
		}
		System.out.println(Str);
	}
	


}
