import java.util.Scanner;
public class Employee {
	
	int id;
	String name;
	int monthlyBasic;
	
	static int esic;
	static int mediclam;
	static int professionalTax;
	
	
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

}
