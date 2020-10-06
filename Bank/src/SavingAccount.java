public class SavingAccount {
 private String name;
 private double balance;
 private int accountNo;
 private static int accountnumber = 10100;
 
 {
	 this.accountNo=accountnumber;
	 accountnumber= (int) Math.random() * 10000;
 }

 public SavingAccount(String name, double balance) {
	 this.name = name;
	 this.balance = balance;
 }
 public SavingAccount(String name) {
	 this(name,0);
 }
 
 public void withdraw(double withdraw) throws Exception{
		 if(balance<=0) {
			 throw new Exception("Cant withdraw money. Account balance is 0.");
		 }
		 else {
			 balance-=withdraw;
		 }		 
 }
 
 public void deposit(double deposit) {
	 balance+=deposit;
	 
 }
 public void display() {	 
	 System.out.println("Account details: ");
	 System.out.println("Account No: " + accountNo);
	 System.out.println("Name: " + name);
	 System.out.println("Balance: " + balance);	 
 }
 
 public static void getNextAccountNo() {
	 System.out.println("Next account number will be: " + accountnumber);
 }
  public String getName() {
	return name;
  }

  public double getBalance() {
	return balance;
  }

   public int getAccountNo() {
	return accountNo;
   }

}
