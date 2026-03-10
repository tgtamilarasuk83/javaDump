package classes;

public class demo2class {
	
	private  String name;
	private  String department;
	
	
	void Setvalue(String name, String department) {
		this.name =name;
		this.department = department;
		
	}
	
	void getvalues() {
		System.out.println(this.name);
		System.out.println(this.department);
		
	}
	
	
	public static void main(String args[]) {
		demo2class D1 =new demo2class();
		D1.Setvalue("Tamil", "Cse");
		D1.getvalues();
		
		demo2class D2 =new demo2class();
		D2.Setvalue("Tamil 1", "Cse 1");
		D2.getvalues();
		
		demo2class D3 =new demo2class();
		D3.Setvalue("Tamil 2", "Cse 2");
		D3.getvalues();
		
	}
	

}
