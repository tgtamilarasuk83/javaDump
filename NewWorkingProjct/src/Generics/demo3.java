package Generics;

public class demo3 <T> { 
	
	static <T> void display( T num) {
		System.out.println(num);
	}
	
	public static void main(String args[]) {
		display(30);
		display("TAmil");
		display(30.0000000000000000);
	}
	

}
