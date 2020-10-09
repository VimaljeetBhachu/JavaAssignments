import java.io.File;
import java.util.Scanner;

public class ShowSubDirectory {

	public static String showDirectory(String path) {
		try {
			File dir = new File(path);
			File[] subDir = dir.listFiles(child -> {
				return child.isDirectory();
			});
			for (File it : subDir) {
				System.out.println(it.getName());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	public static void main(String[] args) {

		System.out.println("Enter path of directory:");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();

		showDirectory(path);
	}

}
