import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SavingAccountTest {
	
	@Test
	@DisplayName("Deposit Money")
	void test3() {
		SavingAccount acc1=new SavingAccount("Vimaljeet",20000);
		acc1.deposit(5000);
		assertEquals(25000,acc1.getBalance());
	}
	
	@Test
	@DisplayName("Withdraw Money")
	void test4() {
		SavingAccount acc1=new SavingAccount("Vimaljeet",25000);
		try {
			acc1.withdraw(2000);			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(23000,acc1.getBalance());
	}

	@Test
	@DisplayName("Payment gateway transfer successfull")
	void test5() {
		try {
		SavingAccount acc1=new SavingAccount("Vimaljeet",23000);
		SavingAccount acc2=new SavingAccount("Zayn");	
		assertEquals(true,PaymentGateway.transfer(acc1, acc2, 1000));
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	@DisplayName("Payment gateway transfer failed")
	void test6() {
		SavingAccount acc1=new SavingAccount("Vimaljeet");
		SavingAccount acc2=new SavingAccount("vjsb",1000);	
		assertEquals(false,PaymentGateway.transfer(acc1, acc2, 1000));
	}
	
	@Test
	@DisplayName("withdrawal method throwing exception when amount is less than balance")
	void test7() {
		SavingAccount acc1=new SavingAccount("Vimaljeet");
		assertThrows(Exception.class,()->acc1.withdraw(1000));
	}
}
