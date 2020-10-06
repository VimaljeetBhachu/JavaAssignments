import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SquareOfSquaresTest {

	@Test
	@DisplayName("Test for a negative number")
	void testNegativeNumber() {
		assertEquals(SquareOfSquares.isSquare(-1), false, "-1: Negative numbers cannot be square numbers");
	}
	
	@Test
	@DisplayName("Test for zero")
	void testZero() {
		assertEquals(SquareOfSquares.isSquare(0), true, "-1: 0 is a square number (0 * 0)");
	}

	@Test
	@DisplayName("Test for Positive Number 3")
	void testPositiveNumber1() {
		assertEquals(SquareOfSquares.isSquare(3), false, "3 is not a square number");
	}
	
	@Test
	@DisplayName("Test for Positive Number 4")
	void testZerotestPositiveNumber2() {
		assertEquals(SquareOfSquares.isSquare(4), true, "4 is a square number (2 * 2)");
	}
	
	@Test
	@DisplayName("Test for Positive Number 25")
	void testPositiveNumber3() {
		assertEquals(SquareOfSquares.isSquare(25), true, "25 is a square number (5 * 5)");
	}
	
	@Test
	@DisplayName("Test for Positive Number 26")
	void testPositiveNumber4() {
		assertEquals(SquareOfSquares.isSquare(26), false, "26 is not a square number");
	}
}
