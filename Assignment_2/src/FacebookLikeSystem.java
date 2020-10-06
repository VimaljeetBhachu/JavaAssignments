import org.apache.log4j.Logger;

public class FacebookLikeSystem {
	static Logger logger = Logger.getLogger(FacebookLikeSystem.class);
	
	static String facebookLikes(String arr[]){
		logger.info("Inside facebookLikes Method");
		String temp = null;
		if(arr.length == 0) {
			logger.info("no one likes this");
			temp="no one likes this";
		}
		else if(arr.length == 1) {
			temp=arr[0] + " likes this";
			logger.info(temp + " likes this");
		}
		else if(arr.length == 2) {
			temp= arr[0] + " and " + arr[1] + " likes this";
			logger.info(temp + " likes this");
		}
		else if(arr.length == 3) {
			temp= arr[0] +", "+ arr[1] + " and " + arr[2] + " likes this";
			logger.info(temp + " likes this");
		}
		else {
			temp= arr[0] + ", "+ arr[1] + " and " + (arr.length-2) + " others likes this";
			logger.info(temp + " likes this");
		}
		return temp;
	}
}