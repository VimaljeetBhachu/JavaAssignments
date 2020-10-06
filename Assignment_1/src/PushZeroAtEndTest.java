import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class PushZeroAtEndTest {

	@Test
	@DisplayName("Random distibution of zeros")
	void test() {
		int[] actual = PushZeroAtEnd.pushZero(new int[] { 1, 2, 0, 4, 3, 0, 5, 0 });
		int[] expected = { 1, 2, 5, 4, 3, 0, 0, 0 };
		assertArrayEquals(expected, actual);
	}

	@Test
	@DisplayName("All zeros already at the end")
	void testZeroAtEnd() {
		int[] actual = PushZeroAtEnd.pushZero(new int[] { 1, 2, 5, 4, 3, 0, 0, 0 });
		int[] expected = { 1, 2, 5, 4, 3, 0, 0, 0 };
		assertArrayEquals(expected, actual);
	}

	@Test
	@DisplayName("All zeros at the start")
	void testZeroAtStart() {
		int[] actual = PushZeroAtEnd.pushZero(new int[] { 0, 0, 1, 2, 3 });
		int[] expected = { 3, 2, 1, 0, 0 };
		assertArrayEquals(expected, actual);
	}

	@Test
	@DisplayName("No zeros in array")
	void testNoZero() {
		int[] actual = PushZeroAtEnd.pushZero(new int[] { 4, 6, 7, 1, 2, 3 });
		int[] expected = { 4, 6, 7, 1, 2, 3 };
		assertArrayEquals(expected, actual);
	}

	@Test
	@DisplayName("zero with negative and positive numbers")
	void testZeroNegative() {
		int[] actual = PushZeroAtEnd.pushZero(new int[] { -1, -2, 0, 4, 3, 0, 0, 0 });
		int[] expected = { -1, -2, 3, 4, 0, 0, 0, 0 };
		assertArrayEquals(expected, actual);
	}

}
