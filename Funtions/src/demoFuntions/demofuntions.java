package demoFuntions;

public class demofuntions {
	
	static  void TicketBooking( String Mname,String descrip, String  duration ,String lang , String release, String country, String genere) {
		System.out.println(Mname);
		System.out.println(descrip);
		System.out.println( duration);
		System.out.println( lang );
		System.out.println( release);
		System.out.println( country);
		System.out.println(genere);	
		
	}
	
	public static void main(String args[]) {
		
		String Mname = "Jananayagam" ;
		String descrip ="Politics";
		String duration = "5years ";
		String lang = "Tamil";
		String release = "March";
	
		String country = "TamilNadu";
		String genere = "Politics";
		
		TicketBooking(Mname,descrip, duration , lang , release, country,genere );
		
		
		
		
	}

}
