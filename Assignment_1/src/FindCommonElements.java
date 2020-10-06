import org.apache.log4j.Logger;

public class FindCommonElements {

	static Logger logger = Logger.getLogger(FindCommonElements.class);

	static int[] findCommonElements(int arr1[], int arr2[], int arr3[]) {
		logger.info("inside findCommonElements Method");

		int temp[] = new int[arr1.length];
		for (int i = 0, j = 0; i < arr1.length; i++) {
			logger.info("Entered findCommonElements FOR loop");
			if (findItem(arr2, arr1[i]) && findItem(arr3, arr1[i])) {
				temp[j++] = arr1[i];
			}
			logger.info("Executed for loop findCommonElements");
		}
		return temp;
	}

	static boolean findItem(int arr[], int item) {
		logger.info("Entered Method findItem");
		for (int i = 0; i < arr.length; i++) {
			logger.info("Entered findItem FOR loop");
			if (arr[i] == item)
				return true;
		}
		logger.info("Executed for loop findItem");
		return false;
	}
}