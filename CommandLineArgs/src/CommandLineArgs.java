import java.util.Scanner;
import java.util.logging.Logger;
public class CommandLineArgs {
	
	//final Logger logger = Logger.getLogger(CommandLineArgs.class);
	
	public static void addingNumbers(double numOne,double numTwo,double numThree) {
		try {
		double numTotal = numOne + numTwo + numThree;
		System.out.println("Sum: " + numTotal);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	
}
