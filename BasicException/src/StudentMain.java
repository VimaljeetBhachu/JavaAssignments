import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws IOException {
		    Scanner scan = new Scanner(System.in);
			
			String name = null;
			int roll = 0;	
			String course = null;
			int age = 0;
			
			System.out.println("Enter Student Name: ");
			name = scan.nextLine();
			System.out.print("Enter Student Course: ");
			course = scan.nextLine();
			System.out.println("Enter Student roll number: ");
			roll = scan.nextInt();		
			System.out.println("Enter Student Age: ");
			age = scan.nextInt();
	
			Student std = new Student(roll, name, age, course);
			try {
				std.checkName(name);
				std.checkAge(age);			
				std.studentInfo(); 
			}catch(Exception e) {
				System.out.println(e);
			}
		}

}
