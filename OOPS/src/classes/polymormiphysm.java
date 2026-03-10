package classes;


// contructor support polymorphism


public class polymormiphysm {
	
	
	int num;
	String age;
	 polymormiphysm() {
		
	}
	 polymormiphysm(int a, String b){
		 num =a;
		 age = b;
	 }
	 
	 public static void main(String args[]) {
		 polymormiphysm T1 = new polymormiphysm();
		 polymormiphysm T2 = new polymormiphysm(3,"A");
		 
		 System.out.println(T1.num);
		 System.out.println(T1.age);
		 System.out.println();
		 System.out.println(T2.num);
		 System.out.println(T2.age);
	 }
	
	
}
