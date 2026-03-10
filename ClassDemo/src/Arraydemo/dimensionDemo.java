package Arraydemo;

/* Two dimension Array demo 
 */
public class dimensionDemo {
	
	public static void main(String args[]) {
		
		int array[][] = {{2,3},{3,4},{5,6}}; 
		
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
