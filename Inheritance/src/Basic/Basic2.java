package Basic;

public class Basic2 {
	static int iD = (int) (Math.random() * 10);
	
	public void basic2Method() {
		System.out.println("This is non Static method from Basic 2 class " + iD);
	}
	
	public static void basic2StaticMethod() {
		System.out.println("This is Static method from Basic 2 class " + iD);
	}
}
