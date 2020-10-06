package Advance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class MMCurrentAccTest {

	CurrentAcc account=new MMCurrentAcc(101,"Vimaljeet",2000,1000);
	@Test
	@DisplayName("Test No.1")
	void test1() {
	account.deposit(500);
	assertEquals(2000,account.getAccBal());
	}
	
	@Test
	@DisplayName("Test No.2")
	void test2() {
	account.withdraw(1000);
	assertEquals(2000,account.getAccBal());
	}
}
