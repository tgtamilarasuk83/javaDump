package Arraydemo;

public class StringArrrayDEMO {
	
	public static void main(String args[]) {
		String[] S = new String[5];
		
		S[0] =  "Tamil";
		S[1] =  "English";
		S[2] =  "Maths";
		S[3] =  "Sciencee";
		S[4] =  "Social";
		
		
		for(String A : S) {
			System.out.println(A);
		}
		
	}

}
