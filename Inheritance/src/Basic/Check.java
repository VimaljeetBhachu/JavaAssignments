package Basic;

public class Check {
	int id = (int) (Math.random() * 10);
	private String name = "Vimaljeet";
	public int age = 20;
	protected double marks = 684;
	double totalMarks = 800.00;
	
	public void disp() {
		System.out.println(name + "'s id is " + id + " and age is " + age + " with a total marks of " + marks + " out of " + totalMarks + ".");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
