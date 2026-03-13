package Generics;





class Demo11<T,q,r> {
	T id;
	q rollno;
	r name;
	
	Demo11(T id, q roolno, r name){
		this.id = id ;
		this.rollno = roolno;
		this.name = name;
		
		
	}
	
	void dispaly() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(rollno);
	}
	

}
 
 public class Demo2{
	 public static void main(String args[]) {
		 Demo11<Integer,Integer,String>  D = new Demo11<>(23, 24, "Tamil");
		 D.dispaly();
		 
		 	 }
	 
 }

