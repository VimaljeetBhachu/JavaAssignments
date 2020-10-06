package datetime;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class DaysAliveTest {

	@Test
	@DisplayName("Test for a valid dob and todays date")
	void testWithCorrectDobAndTodaysDate() {
		try {
			assertEquals(8005, DaysAlive.daysCalculator(DaysAlive.todaysDate(2020, 10, 06), DaysAlive.birthDate(1998, 11, 06)));
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	@Test
	@DisplayName("Test for a Invalid dob and todays date")
	void testWithInCorrectDobAndTodaysDate() {
		try {
			assertEquals(-8005, DaysAlive.daysCalculator(DaysAlive.todaysDate(1998, 11, 06), DaysAlive.birthDate(2020, 10, 06)));
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
