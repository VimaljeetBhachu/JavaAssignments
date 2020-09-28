package Basic;

public class CheckDemo extends Check{
	
	public void disp2() {
		System.out.println(getName() + "'s id is " + id + " and age is " + age + " with a total marks of " + marks + " out of " + totalMarks + ".");
	}

	public static void main(String[] args) {
		CheckDemo c = new CheckDemo();
		c.disp();
		c.disp2();
	}
}
