import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindCommonElementTest {

	@Test
	void test() {
		int[] arr1= {1, 5, 10, 20, 40, 80},arr2= {6, 7, 20, 80, 100},arr3= {3, 4, 15, 20, 30, 70, 80, 120};
		int[] actual=FindCommonElements.findCommonElements(arr1,arr2,arr3);
		int[] arr=new int[actual.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)actual[i];
		}
		int[] expected= {20,80};
		assertArrayEquals(expected,arr);
		
	}
	@Test
	@DisplayName("array containaing duplicate elements")
	void testArray() {
		int[] arr1= {1,2,0,4,0,9},arr2= {6, 2,4,0, 80, 100},
				arr3= {3, 4,0,9,6, 120};
		int[] actual=FindCommonElements.findCommonElements(arr1,arr2,arr3);
		int[] arr=new int[actual.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)actual[i];
		}
		int[] expected= {0,4};
		assertArrayEquals(expected,arr);
		
	}

}
