package Generics;

 class Demo1<T> {
	T id;
	T rollno;
	String name;
	
	Demo1(T id, T roollno, String name){
		this.id = id ;
		this.rollno = roollno;
		this.name = name;
		
	}
	
	void dispaly() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(rollno);
	}
	

}
 
 public class Demo{
	 public static void main(String args[]) {
		 Demo1  D = new Demo1(23, 24, "Tamil");
		 D.dispaly();
		 
	 }
	 
 }
