package Interface;

public interface Bank {
	String accountType1 = "Savings"; //by default variables are static and final type
	String accountType2 = "Current";
		
	public void depositMoney(); //by default methods are abstract
	public void viewBalance();
	public void transferMoney();
	public void openFixedDeposit();
	
}


