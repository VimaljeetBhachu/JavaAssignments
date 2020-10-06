import org.apache.log4j.Logger;

public class SquareOfSquares {

	static Logger logger = Logger.getLogger(SquareOfSquares.class);
	public static boolean isSquare(int num) {
		
		logger.info("Inside isSquare Method ");
		if(num<0) { 
			return false;
		}
		if(num==0) {
			return true;
		}
		
		for(int i=1;i*i<=num;i++) {
			if(i*i==num) {
				logger.info(num + " is a square number");
				return true;
			}
		}
		
     return false;
	}
	
}
