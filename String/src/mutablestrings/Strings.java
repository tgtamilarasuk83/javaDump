package mutablestrings;

import java.lang.*;


	
	
	

public class Strings {
	static void contact1(String s1) {
		System.out.println(s1 + "hello");
		
	}
	
	static void concat2(StringBuilder s2) {
		s2.append("Raj");
	}
	
	static void concat3(StringBuilder s3) {
		s3.append("Raj");
	}
	public static void main(String args[]) {
	
		String s1 = "Tamil";
		contact1(s1);
		StringBuilder s2  = new StringBuilder("Hello");
	    concat2(s2);
	    System.out.println(s2);
		StringBuilder s3  = new StringBuilder("Hello hello");
		concat2(s3);
		 System.out.println(s3);
	}
	

}
