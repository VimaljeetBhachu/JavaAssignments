package Advance;

public class Main {
	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(101, "Rishabh Rathi", 20250, true);
		CurrentAcc ca = new MMCurrentAcc(102, "Shudhanshu Saxena", 80000, 20000);
		
		sa.withdraw(5000);
		sa.toString();
		
	}
}
