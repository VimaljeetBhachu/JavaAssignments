public class Rectangle {
	private float length;
	private float breadth;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public float getLength() {
		return this.length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return this.breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public float getArea() {
		return getLength()*getBreadth();
	}

	public float getPerimeter() {
		float periMeter = 0;
		try {
		periMeter = 2*(getLength()+getBreadth());
		}catch(Exception e) {
			System.out.println(e);
		}
		return periMeter;
	}

	public static boolean isAreaEqual(Rectangle r1, Rectangle r2) {
		if(r1.getArea() == r2.getArea())
			return true;
		return false;
	}
}