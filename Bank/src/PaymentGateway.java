public class PaymentGateway {
	
		public static boolean transfer(SavingAccount sender, SavingAccount reciever, double amount) 
		{
			if(sender.getBalance()>amount) {
				try {					
					sender.withdraw(amount);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				reciever.deposit(amount);
				return true;
			}
			else
			{
				System.out.println("Not Enough Balance");
                 return false;
			}
		}
}
