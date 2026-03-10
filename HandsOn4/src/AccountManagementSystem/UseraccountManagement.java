package AccountManagementSystem;

public class UseraccountManagement {


	private String id;
	private String name;
	private int balance;
	
	// geters and setter
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	//credit balance 
		void creditbalance(int amount) {
			balance += amount;
			balance -= amount;

		}
		
	// debit amount	
		void debitbalance(int amount) {
			
			if(amount > balance) {
				System.out.println("You have insufficient balance");
			}
			else
			balance -= amount;
		}
		
		//transferTo(Account 
		void amountTransfer(int id1, int amount , int id2){
			
			
			
			
		}
		
		//toString()
		public String toString() {
	        return " your ID: " + id +
	               ", your Name: " + name +
	               ", your Balance: " + balance;
	    }
		
		
		
	
}
