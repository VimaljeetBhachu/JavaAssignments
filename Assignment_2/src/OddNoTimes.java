import java.util.HashMap;

import org.apache.log4j.Logger;

public class OddNoTimes {
	static Logger logger = Logger.getLogger(OddNoTimes.class);
	static int findOdd(int arr[]) {
		logger.info("Inside findOdd Method");
		int n=0;
		HashMap<Integer, Integer> list= new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(list.containsKey(arr[i]))
				list.put(arr[i], list.get(arr[i]) + 1);
			else
				list.put(arr[i], 1);
		}
		for(Integer i : list.keySet()) {
			if((list.get(i) % 2) != 0 ) {
				n = i; 
				break;
			}
		}
		logger.info("Number that appeared odd number of times " + n);
		return n;
	}
}