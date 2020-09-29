package Basic;

public class ShapeDemo {

	public static void main(String[] args) {
		ShapeNine sN = new ShapeNine();
		Circle cR = new Circle();
		Polygon pG = new Polygon();
		Rectangle rT = new Rectangle();
		String[] arr = new String[]{sN.draw(), cR.draw(), pG.draw(), rT.draw()};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
