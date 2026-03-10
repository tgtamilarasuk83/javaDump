package classes;

public class Employee extends HRDepartment {
	
		String salary;
		int id;
		String name;
		
		
		//This keyword using to referencr the current variable
		Employee(String salary,int id,String name){
		this.salary = salary;
		this.id     = id;
		this.name   = name;
		}
		
		//This keyword using to reference the constructor 
		
		Employee(){
			this("100", 12, "tamil");
		}

		
		// using another method in same funtion 
		void registerEmployees() {
			this.displaydetails();
		}
		
		void displaydetails() {
			System.out.println(salary);
			System.out.println(id);
			System.out.println(name);
			
		}
		
		// this keyword use to pass the current object
		
		void sendforProcessing() {
			HRDepartment Hr = new HRDepartment();
			
			Hr.employeeProcess();
		}
		
		// this keyword use the return  current object  
		
		Employee updatedetails() {
			this.salary = "100000";
			return this;
		}
		

}


class HRDepartment{
			void employeeProcess() {
				
			}
	
}
