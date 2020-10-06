public class MoneyMoneyBank {

	public static void main(String[] args) {
		try {
			SavingAccount acc1=new SavingAccount("Vimaljeet",20000);
			SavingAccount acc2=new SavingAccount("Shank");
			acc1.display();
			acc2.display();
			System.out.println("After deposit: ");
			acc1.deposit(1500);
			acc1.display();
			acc2.deposit(3025);
			acc2.display();
			System.out.println("After withdrawl: ");
			acc1.withdraw(2000);
			acc1.display();
			acc2.withdraw(1500);
			acc2.withdraw(999);
			acc2.display();
			SavingAccount.getNextAccountNo();
			PaymentGateway.transfer(acc1, acc2, 1000);			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
