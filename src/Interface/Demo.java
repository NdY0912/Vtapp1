package Interface;

public class Demo {
	


		public static void main(String[] args) {
			
			HDFChild h = new HDFChild();
			
			Bank b = h;
			
			b.depositMoney();
			b.viewBalance();
			b.transferMoney();
			h.withdrawMoney();
			System.out.println(Bank.accountType1);	
			System.out.println(Bank.accountType2);		


		}

	}


