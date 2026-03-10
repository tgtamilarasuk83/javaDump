package ArrayEasy;

public class ElementFrequency {
	public static void main(String args[]) {
		
		int array[]= {5,5,5,5,5,5,5,2,2,2,2,2,2};
		
		for (int i=0; i< array.length; i++) {
			int count =0;
			int tempOg  = array[i];
			int temp = array[i];
			if(array
					[i] == -1) {
				continue;
			}
			for (int j=0; j < array.length; j++) {
				if(array[j] == -1) {
					continue;
				}
				
				if(array[j]== temp) {
					count ++;
					array[j] = -1;
				}							
			}
			System.out.println("occurence of = "+ tempOg +" is = "+ count);
		}
		
	}

}
