package ArrayEasy;

public class ArrayMaxMin {
public static void main(String args[]) {
		
		int array[]= {5,2,4,2,1,0};
		
		// Sorting of an array
		
		for(int i=0; i< array.length; i++) {
			for(int k=i+1; k< array.length; k++) {
					if(array[i]>array[k]) {
						int temp = array[i];
						array[i] = array[k];
						array[k] = temp;
					}
				
			}
			
		}
		
		
		System.out.println("Min = " +array[0]);
		System.out.println("Max = " +array[array.length-1]);
		
		
	}

}
