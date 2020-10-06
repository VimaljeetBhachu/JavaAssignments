import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class ReverseStringTest {

	@Test
	@DisplayName("Test Case 1")
	void test1() {
		assertEquals(ReverseString.reverseString("Welcome"), "emocleW");
	}
	
	@Test
	@DisplayName("Test Case 2")
	void test2() {
		assertEquals(ReverseString.reverseString("Hey fellow warriors"), "Hey wollef sroirraw");
	}
	
	@Test
	@DisplayName("Test Case 3")
	void test3() {
		assertEquals(ReverseString.reverseString("This is a test"), "This is a test");
	}
	
	@Test
	@DisplayName("Test Case 4")
	void test4() {
		assertEquals(ReverseString.reverseString("This is another test"), "This is rehtona test");
	}
	
	@Test
	@DisplayName("Test Case 5")
	void test5() {
		assertEquals(ReverseString.reverseString("You are almost to the last test"), "You are tsomla to the last test");
	}
	
	@Test
	@DisplayName("Test Case 6")
	void test6() {
		assertEquals(ReverseString.reverseString("Just kidding there is still one more"), "Just gniddik ereht is llits one more");
	}
	
	@Test
	@DisplayName("Test Case 7")
	void test7() {
		assertEquals(ReverseString.reverseString("Seriously this is the last one"), "ylsuoireS this is the last one");
	}
}
