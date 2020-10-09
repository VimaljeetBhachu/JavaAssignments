import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileLineCount {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter File path: ");
		String path = sc.nextLine();	
		System.out.println("Enter file name : ");
		String fileName = sc.nextLine();
		String filePath = path + "/" + fileName;
		Path file = Paths.get("fileName");
		
		long count = Files.lines(file).count();
	    System.out.println("Total Lines: " + count);
	}

}
