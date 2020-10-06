import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class LargestThreeElementsTest {

	@Test
	@DisplayName("Largest three elements for positive numbers")
	void testLargestElement() {
		int[] actual=LargestThreeElements.findLargestThreeElements(new int[]{7,2,5,1,9,3});
		int[] expected= new int[]{9, 7, 5};
		assertArrayEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Largest three elements for negative numbers")
	void testLargest() {
		int[] actual=LargestThreeElements.findLargestThreeElements(new int[]{-7,-2,-5,-1,-9,-3});
		int[] expected= new int[]{-3, -2, -1};
		assertArrayEquals(expected,actual);
	}

	@Test
	@DisplayName("Largest three elements for both posiitve and negative numbers")
	void testLargestNum() {
		int[] actual=LargestThreeElements.findLargestThreeElements(new int[]{-7,2,5,-1,9,3});
		int[] expected= new int[]{9, 5, 3};
		assertArrayEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Largest three elements for Zero, Positive and negative numbers")
	void testLargestZero() {
		int[] actual=LargestThreeElements.findLargestThreeElements(new int[]{0,0,0,-1,-3,8});
		int[] expected= new int[]{8, 0, -1};
		assertArrayEquals(expected,actual);
	}
}
