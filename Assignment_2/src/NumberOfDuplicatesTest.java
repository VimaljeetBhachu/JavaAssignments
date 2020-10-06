import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class NumberOfDuplicatesTest {

	@Test
	@DisplayName("Testing for string containing all lowercase alphabets")
	void test2() {
		int actual=NumberOfDuplicates.findDuplicateValues("indivisibility");
		int expected=1;
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Testing for string containing all uppercase alphabets")
	void test3() {
		int actual=NumberOfDuplicates.findDuplicateValues("AABBCDE");
		int expected=2;
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Testing for string containing both numbers and alphabets")
	void test4() {
		int actual=NumberOfDuplicates.findDuplicateValues("aAbc$$1233");
		int expected=3;
		assertEquals(expected,actual);
	}

}
