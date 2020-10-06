
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class FindMissingNumberTest {

	@DisplayName("Testing for find number function")
	@Test
	void testfindNumber() {
		int actual = FindMissingNumber.findNumber(new int[] { 1, 2, 3, 4, 6, 7, 8 });
		assertEquals(5, actual, "missing number");
	}

}
