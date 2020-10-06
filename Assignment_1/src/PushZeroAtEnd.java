import org.apache.log4j.Logger;

public class PushZeroAtEnd {

	static int[] pushZero(int a[]) {
		Logger logger = Logger.getLogger(PushZeroAtEnd.class);

		for (int i = 0, j = 1; i < a.length - 1; i++, j++) {
			logger.info("Array to be sorted to have zeros at end");
			if (a[i] == 0 && a[j] != 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}
}