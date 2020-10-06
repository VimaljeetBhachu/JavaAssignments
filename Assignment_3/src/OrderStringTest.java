import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class OrderStringTest {

	@Test
	@DisplayName("First test")
	void test1() {		
		assertEquals(OrderString.orderString("is2 Thi1s T4est 3a"), "Thi1s is2 3a T4est");
	}
	@Test
	@DisplayName("Second test")
	void test2() {		
		assertEquals(OrderString.orderString("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");
	}
	@Test
	@DisplayName("Third test")
	void test3() {		
		assertEquals(OrderString.orderString(""), "");
	}
}
