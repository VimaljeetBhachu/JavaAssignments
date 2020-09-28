import java.io.IOException;
import org.apache.log4j.Logger;
import java.util.Scanner;

public class Factorial {
	
	final static Logger logger = Logger.getLogger(Factorial.class);
	
	public long getFactorial(int num, int numMaxValue) throws IOException {
		  int i;
		  long fact = 1;
			  for(i=1;i<=num;i++){     
			      fact=fact*i;    
			  }
			  if(fact > numMaxValue) {
				  logger.fatal("Max value allowed is : " + numMaxValue);
				  throw new IOException("FactorialException");
			  }else {				  
				  return fact;
			  }	
	}
}
