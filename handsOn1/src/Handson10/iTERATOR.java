package Handson10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class iTERATOR {
    public static void main(String[] args) {
        
        
        Set<String> s = new HashSet<>();
        
        System.out.println("Enter the no words :");
		
		Scanner scanf = new Scanner(System.in);
	    int count = scanf.nextInt();
	    scanf.nextLine();
	    String name ;
		for(int i=1; i<=count ; i++) {
			System.out.println("Enter the no of words :"+ i);
			 name = scanf.nextLine();
	            s.add(name);
		}
        
        
        Iterator<String> it = s.iterator();
        
        String result = "";
        
        while(it.hasNext()) {
            String value = it.next();
            
            System.out.println("Elements in the Set : " + value);
            
            result = result + value + " ";
        }
        
        System.out.println("Concatenated result: " + result);
    }
}

