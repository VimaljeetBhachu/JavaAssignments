import java.util.Scanner;

public class CommandLineArgsMain {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			double firstNumber;
			double secondNumber;
			double thirdNumber;
			System.out.println("Enter 3 numbers: ");
			firstNumber = scan.nextDouble();
			secondNumber = scan.nextDouble();
			thirdNumber = scan.nextDouble();
			CommandLineArgs obj = new CommandLineArgs();
			obj.addingNumbers(firstNumber, secondNumber, thirdNumber);
		} catch(Exception e) {
			System.out.println("ERROR: " + e);
			System.out.println("The program execution finished with an ERROR");
		}
	}

}
