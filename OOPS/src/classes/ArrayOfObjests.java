package classes;

public class ArrayOfObjests {
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
		demo2class D1[] =new demo2class[10];
		
		for(int i=0; i<10; i++) {
			D1[i] = new demo2class();
		}
		
		
		D1[1].Setvalue("Tamil", "Cse");
		D1[1].getvalues();
		
		//demo2class D2 =new demo2class();
		D1[2].Setvalue("Tamil 1", "Cse 1");
		D1[2].getvalues();
		
		//demo2class D3 =new demo2class();
		D1[3].Setvalue("Tamil 2", "Cse 2");
		D1[3].getvalues();
		
	}

}
