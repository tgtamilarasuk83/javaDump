package classes;

public class dempclass {

	String name = "Tamil";
	int id = 1;
	String location = "chennai";
	
	void dispaly() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(location);
	}
	
	
	public static void main(String args[]) {
		
		dempclass T1 = new dempclass();
		System.out.println(T1.name);
	}
}
