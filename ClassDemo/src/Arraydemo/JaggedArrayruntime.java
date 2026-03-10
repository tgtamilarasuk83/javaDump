package Arraydemo;
import java.util.Scanner;
public class JaggedArrayruntime {
	private static Scanner scanf;

	public static void main( String args[]) {
		
		
		scanf = new Scanner(System.in);
		
		System.out.println("Enyter the rows:");
		int rows = scanf.nextInt();
		
		
		int seats[][] = new int[rows][];
				
//				int vipSeats =0 , premiumSeats =0 , NomalSeats= 0;
//				int NotvipSeats =0 , NotpremiumSeats =0 , NotNomalSeats= 0;
				
				
				
				for(int i=0; i<seats.length; i++) {
					
					System.out.println("enter thr No of coloums for the " + i +" row");
					int coloums = scanf.nextInt();
					
					
					 seats[i] = new int[coloums];

					for(int j=0; j< coloums; j++) {
						System.out.println("enter the value of " + i +"row"+ j +"coloum");	
						seats[i][j] = scanf.nextInt();
					}
					
				}
				
				System.out.println("Jagged Array from USer Input ");
				
				for(int i=0; i<seats.length; i++) {
					for(int j=0; j<seats[i].length; j++) {
						System.out.print(seats[i][j] + " ");
					}
					System.out.println();
				}
				
				
				
				
//				


}
}
