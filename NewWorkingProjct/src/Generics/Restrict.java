package Generics;


public class Restrict<T> {
	
	static <T extends Number> void display(T num) {
		System.out.println(num);
		
	}
	
	public static void main(String args[]) {
		display(20);
		display("Tamil");
	}

}
