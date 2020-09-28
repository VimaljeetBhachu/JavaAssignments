package Basic;

public class Basic2Main extends Basic2 {

	public static void main(String[] args) {
		basic2StaticMethod();
		//Static method will get called immediately.
		//Creating object for calling non static method.
		Basic2 b2 = new Basic2();
		b2.basic2Method();
	}
}
