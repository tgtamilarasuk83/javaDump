package Arraydemo;

public class JaggedArraydemo {
	public static void main( String args[]) {
char seats[][] = {{'A','A','A',},{'A','A','B','A'},{'A','B','A'}};
		
		int vipSeats =0 , premiumSeats =0 , NomalSeats= 0;
		int NotvipSeats =0 , NotpremiumSeats =0 , NotNomalSeats= 0;
		
		
		
		
		
		for(int i = 0; i < seats.length; i++) {

            for(int j = 0; j < seats[i].length; j++) {
				
            	if(i == 0) {
                    if(seats[i][j] == 'A') {
                        vipSeats++;
                    }
                    else {
                    	NotvipSeats++;
                    	
                    }
                }
				
            	if(i == 1) {
                    if(seats[i][j] == 'A') {
                    	premiumSeats++;
                    }
                    else {
                    	NotpremiumSeats++;
                    }
                }
					
				
            	if(i == 2) {
                    if(seats[i][j] == 'A') {
                    	NomalSeats++;
                    }
                    else {
                    	NotNomalSeats++;
                    }
                }
				
			}
			
		}
		
		System.out.println(vipSeats);
		System.out.println(premiumSeats);
		System.out.println(NomalSeats);
		
		System.out.println();
		
		System.out.println(NotvipSeats);
		System.out.println(NotpremiumSeats);
		System.out.println(NotNomalSeats);
		
		
		System.out.println("Seats booked details");
		System.out.println("-------Vipseats-------");
		System.out.println("Totalseats booked = "+vipSeats+" Not booked = "+ NotvipSeats+" Total = "+(NotvipSeats+vipSeats) );
		System.out.println("-------Premium-------");
		System.out.println("Totalseats booked = "+premiumSeats+" Not booked =  "+ NotpremiumSeats+" Total = "+(NotpremiumSeats+premiumSeats) );
		System.out.println("-------Normal-------");
		System.out.println("Totalseats booked = "+ NomalSeats+" Not booked = "+ NotNomalSeats+" Total = "+(NotNomalSeats+ NomalSeats) );
		
	}

}
