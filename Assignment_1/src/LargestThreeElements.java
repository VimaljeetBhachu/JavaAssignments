import java.util.Arrays;

import org.apache.log4j.Logger;

public class LargestThreeElements {
	static Logger logger = Logger.getLogger(LargestThreeElements.class);

	static int[] findLargestThreeElements(int arr[]) {
		logger.info("inside findLargestThreeElements Method");
		Arrays.sort(arr);
		int[] temp = new int[3];
		int arrLength = arr.length;
		for (int i = 0; i < 3; i++) {
			logger.info("inside Largest three element for loop");
			temp[i] = arr[arrLength - i - 1];
		}
		logger.info("Largest 3 elements are: " + temp);
		return temp;
	}
}