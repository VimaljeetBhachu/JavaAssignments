import java.io.IOException;
import java.util.Scanner;
public class Student {
	static Scanner scan = new Scanner(System.in);
	int rollNum = 0;
	String sName;
	int sAge = 0;
	String sCourse = null;
	
	public Student(int roll, String name, int age, String course) {
		rollNum = roll;
		sName = name;
		sAge = age;
		sCourse = course;		
	}
	
	public int checkAge(int age) throws IOException {
		if((age > 15) && (age < 21)) {
			return age;
		} else {
			throw new IOException("AgeNotWithinRangeException");
		}
	}
	
	public String checkName(String name) throws IOException {
		String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}0123456789";
		int flag = 0;
		for (int i=0; i < name.length() ; i++)
        {
            char ch = name.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch))) {
                flag++;
                break;
            }    
            else {
               flag = 0;
            }
        }
		if(flag > 0) {
			throw new IOException("NameNotValidException");
		}else {
			return name;
		}
	}
	
	public void studentInfo() {
		System.out.println("Student Record Added Successfully");
	}

	public static void main(String[] args) throws IOException {
		
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
