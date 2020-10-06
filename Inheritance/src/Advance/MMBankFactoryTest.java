package Advance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class MMBankFactoryTest {

	@Test
	@DisplayName("Test number 1")
	void test1() {
		BankFactory bank = new MMBankFactory();
		bank.getNewCurrentAcc(101, "Vimaljeet", 5000, 1000);
		assertTrue(bank.getNewSavingAcc(102, "Saheb", 2000, true) instanceof SavingAcc );
	}
	
	@Test
	@DisplayName("Test number 2")
	void test2() {
		BankFactory bank = new MMBankFactory();
		bank.getNewCurrentAcc(101, "Vimaljeet", 5000, 1000);
		assertTrue(bank.getNewSavingAcc(102, "Saheb", 2000, false) instanceof SavingAcc );
	}
}
