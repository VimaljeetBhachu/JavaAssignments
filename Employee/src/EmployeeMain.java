import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {	
		Employee employee = new Employee();
		Scanner scan = new Scanner(System.in);
		double monthlyTakeHome, monthlyBasic, rand, esic = 0;
		float profTax;		
		final double hraRate = 0.5;
		final double pfRate = 0.1;
		final int medicalAllowance = 1250;
		final int conveyanceAllowance = 800;
		final double esicRate1 = 0.0475;
		final double esicRate2 = 0.11;
		final double salaryLimit1 = 50000;
		final double salaryLimit2 = 10000;
		final double salaryLimit3 = 5000;
		
		try {
			int eId;
			rand = Math.random();
			eId = (int)(rand * 5000);
			System.out.println("Employee Id :" + eId);
			System.out.print("Enter Employee name:");
			String eName = scan.nextLine();
			System.out.print("Enter Monthly Basic: ");
			monthlyBasic = scan.nextInt();
			
			double hra = (hraRate * monthlyBasic);
			double pf = (pfRate * monthlyBasic);
			
			if(monthlyBasic <= salaryLimit3) {
				esic = (esicRate1 * monthlyBasic);
			}else if(monthlyBasic >= salaryLimit1) {
				esic = (esicRate2 * monthlyBasic);
			} else {}
			double gMGS = employee.getMonthlyGrossSalary(monthlyBasic, hra, medicalAllowance, conveyanceAllowance);
			
			if(gMGS <= salaryLimit2) {
				profTax = 50;
			}else {
				profTax = 100;
			}
			employee.getAnnualBasic(monthlyBasic);
			employee.getAnnualGrossSalary(gMGS);
			double mD = employee.getMonthlyDeductions(pf, esic, profTax);
			double gMTH = employee.getMonthlyTakeHome(gMGS, mD);
			employee.getAnnualTakeHome(gMTH);
			} catch (Exception e) {
			System.out.println("ERROR " + e);
			System.out.println("The program execution finished with an ERROR \nTry Running again.");
			}
	}
}
