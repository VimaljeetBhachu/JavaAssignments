import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		final Logger logger = Logger.getLogger(Main.class);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		logger.info("Enter a number: ");
		int num = scan.nextInt();
		int numMaxValue = Integer.MAX_VALUE;
			if(num < 2) {
				throw new IOException("InvalidInputException");  
			} else {
				Factorial fac = new Factorial();
				long objFact = fac.getFactorial(num, numMaxValue);
				logger.info("Factorial of " + num + " is: " + objFact);
			}

	}

}
