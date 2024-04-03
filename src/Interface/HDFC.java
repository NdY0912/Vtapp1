package Interface;


public abstract class HDFC implements Bank { //Implements is used in case of interface

	public void depositMoney() {
		System.out.println("Depositing money to bank account");
	}

	public void viewBalance() {
		System.out.println("Viewing money in a bank account");		
	}
	
	public void transferMoney() {
		System.out.println("Transferring money to another bank account");
	}
	
	public void withdrawMoney() {
		System.out.println("Withdrawing money from a bank account");		
	}	
	

}