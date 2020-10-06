class DistanceDemo{
	int Feet;
	float inches;
	
	void set(int Feet, float inches) {
		this.Feet=Feet;
		this.inches=inches;
	}

	public int getFeet() {
		return Feet;
	}

	public float getInches() {
		return inches;
	}
	
	public void display() {
		System.out.println("Distance : "+this.Feet+" feets "+this.inches+" inches ");
	}

	public static DistanceDemo sum(DistanceDemo d1,DistanceDemo d2) {
		DistanceDemo d3=new DistanceDemo();
		int feet=d1.getFeet()+d2.getFeet();
		float inches=d1.getInches()+d2.getInches();
		d3.set(feet,inches);
		return d3;
	}
}
public class Distance {

	public static void main(String[] args) {
		DistanceDemo dis1=new DistanceDemo();
		dis1.set(2, 4.2f);
		DistanceDemo dis2=new DistanceDemo();
		dis2.set(3, 5.5f);
		DistanceDemo dis3=DistanceDemo.sum(dis1, dis2);
		dis3.display();

	}

}
