import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class DecreasingOrderTest {

	@Test
	@DisplayName("Reverse Order Check")
	void testReverse() {
		long actual=DecreasingOrder.rearrangeNum(21445);
		long expected=54421;
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Random Order Check")
	void testRandom() {
		long actual=DecreasingOrder.rearrangeNum(145263);
		long expected=654321;
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Duplicate Value Order Check")
	void testDuplicate() {
		long actual=DecreasingOrder.rearrangeNum(896691010);
		long expected = 998661100;
		assertEquals(expected,actual);
	}
	
}
