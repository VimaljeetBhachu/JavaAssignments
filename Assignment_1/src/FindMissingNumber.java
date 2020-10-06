import org.apache.log4j.Logger;

public class FindMissingNumber {
	static Logger missinglogger = Logger.getLogger(FindMissingNumber.class);

	public static int findNumber(int[] arr) {
		missinglogger.info("Array" + arr);
		int n = arr.length + 1;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int expectedSum = n * (n + 1) / 2;
		int result = expectedSum - sum;
		missinglogger.info("missing number:" + result);
		return result;
	}
}