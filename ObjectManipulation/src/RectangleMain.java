import java.util.Scanner;

public class RectangleMain {
	public static void main(String[] args) {
		try {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter length and breadth: ");
		float l= sc.nextFloat();
		float b=sc.nextFloat();
		Rectangle rec = new Rectangle(l,b);
		sc.close();
		System.out.println("Area: "+rec.getArea());
		System.out.println("Perimeter: "+rec.getPerimeter());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
		
}