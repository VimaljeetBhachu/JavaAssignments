import java.io.IOException;
import java.util.Scanner;
public class Factorial {
	
	public long getFactorial(int num, int numMaxValue) throws IOException {
		  int i;
		  long fact = 1;
			  for(i=1;i<=num;i++){     
			      fact=fact*i;    
			  }
			  if(fact > numMaxValue) {
				  System.out.println("Max value allowed is: " + numMaxValue);
				  throw new IOException("FactorialException");
			  }else {				  
				  return fact;
			  }	
	}
	
	public static void main(String[] args) throws IOException {
		
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = scan.nextInt();
	int numMaxValue = Integer.MAX_VALUE;
		if(num < 2) {
			throw new IOException("InvalidInputException");  
		} else {
			Factorial fac = new Factorial();
			long objFact = fac.getFactorial(num, numMaxValue);
			System.out.println("Factorial of " + num + " is: " + objFact);
		}
	}
}
