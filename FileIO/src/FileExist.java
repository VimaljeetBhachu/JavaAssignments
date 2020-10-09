import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;

class findFileExist {

	public boolean isFileExist(String path) throws Exception {
		File file = new File(path);
		if (file.exists())
			return true;
		return false;
	}
}

public class FileExist {
	public static void main(String[] args) throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter File path:");
			String path = sc.next();
			findFileExist fd = new findFileExist();
			if (fd.isFileExist(path)) {
				System.out.println("File exist");
			} else {
				System.out.println("File does not exist");
			}
		} catch (Exception e) {

		}
	}
}
