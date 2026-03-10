package HandonFunctionsEasy;
import java.util.Scanner;
public class SalaryHike {
	
	static void salaryHike(float Salary) {
		
		int hike = (int) (Salary / 100);
		
		 System.out.println("This month Salary hike is "+ hike +" and Total is = " + (Salary+hike);
				
	}
	public static void main(String args[]) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Enter your salary");
		float salary = scanf.nextFloat();
		
		salaryHike(salary);
	}

}
