package ArrayEasy;

public class EvenOddSumArray {
	
	public static void main(String args[]) {
		
		
		int even[] = new int[5];
		int odd[] = new int[5];
		int eve =0;
		int od = 0;
		
		for(int  i=1; i<=10; i++ ) {
			
			if(i%2 ==0) {
				even[eve] = i;
				eve++;
			}
			else {
				odd[od]=i;
				od++;
			}
			
		}
		
		
		for(int i=0; i<5; i++) {
			System.out.println("Odd Numbers are = "+even[i]);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("even Numbers are = "+odd[i]);
		}
	}

}
