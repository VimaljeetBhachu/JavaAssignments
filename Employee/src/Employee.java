import java.util.Scanner;
public class Employee {
	
	public void getAnnualBasic(double monthlyBasic) {
		System.out.println("Annual Basic: " + (12 * monthlyBasic));
	}
	
	public double getMonthlyGrossSalary(double monthlyBasic, double hra, double medicalAllowance, double conveyanceAllowance) {
		double monthlyGrossSalary = (monthlyBasic + hra + medicalAllowance + conveyanceAllowance);
		System.out.println("Monthly Gross Salary: " + monthlyGrossSalary);
		return monthlyGrossSalary;
	}
	
	public void getAnnualGrossSalary(double monthlyGrossSalary) {
		System.out.println("Annual Gross Salary: " + (12 * monthlyGrossSalary));
	}
	
	public double getMonthlyDeductions(double pf, double esic, float profTax) {
		double monthlyDeduction = (pf + esic + profTax);
		System.out.println("Monthly Deductions: " + monthlyDeduction);
		return monthlyDeduction;
	}
	
	public double getMonthlyTakeHome(double gMGS, double mD) {
		double monthlyTakeHome = gMGS - mD;
		System.out.println("Monthly Take Home: " + monthlyTakeHome);
		return monthlyTakeHome;
	}
	
	public void getAnnualTakeHome(double gMTH) {
		System.out.println("Annual Take Home: " + 12 * gMTH);
	}

	
	public static void main(String[] args) {	
		Employee employee = new Employee();
		Scanner scan = new Scanner(System.in);
		double monthlyTakeHome, monthlyBasic, rand, esic = 0;
		float profTax;		
		
		try {
			System.out.print("Enter Employee name:");
			String eName = scan.nextLine();
			System.out.print("Enter Monthly Basic: ");
			monthlyBasic = scan.nextInt();
			int eId;
			rand = Math.random();
			eId = (int)(rand * 5000);
			System.out.println("Employee Id :" + eId);
			
			double hra = (0.5 * monthlyBasic);
			double pf = (0.1 * monthlyBasic);
			int medicalAllowance = 1250;
			int conveyanceAllowance = 800;
			
			if(monthlyBasic <= 5000) {
				esic = (0.0475 * monthlyBasic);
			}else if(monthlyBasic >= 50000) {
				esic = (0.11 * monthlyBasic);
			} else {}
			
			double gMGS = employee.getMonthlyGrossSalary(monthlyBasic, hra, medicalAllowance, conveyanceAllowance);
			
			if(gMGS <= 10000) {
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
