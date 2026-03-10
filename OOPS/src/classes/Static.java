package classes;




 class StaticMain{
	
	static int totalseats;
	
	
	static {
			totalseats = 20;
			System.out.println("Total seats available in block 1 is = " + totalseats);
	}
	
	static {
		totalseats = 30;
		System.out.println("Total seats available in block 2  is = " + totalseats);
		
	}
	
	void bookTicket(int Totaltickets) {
		totalseats =- Totaltickets;		
	}
	void SeatAvailabe() {
		System.out.println("totalseats");
		
	}
	
}


public class Static extends StaticMain {
	public static void main() {
		
		StaticMain M = new StaticMain();
		
		M.SeatAvailabe();
		M.bookTicket(20);
		M.SeatAvailabe();
		
	}
	
	

}