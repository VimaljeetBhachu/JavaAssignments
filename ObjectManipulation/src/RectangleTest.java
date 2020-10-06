import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class RectangleTest {

	@Test
	@DisplayName("Default construtor")
	void testConstructor() {
		Rectangle rectangleObject = new Rectangle(2,4);
		assertEquals(2,rectangleObject.getLength());
		assertEquals(4,rectangleObject.getBreadth());
	}
	
	@Test
	@DisplayName("Area of rectangle")
	void testAreaRectangle() {
		Rectangle rectangleObject = new Rectangle(2,4);
		assertEquals(8,rectangleObject.getArea());
	}

	@Test
	@DisplayName("Perimeter of rectangle")
	void testPerimeterRectangle() {
		Rectangle rectangleObject = new Rectangle(2,4);
		assertEquals(12,rectangleObject.getPerimeter());
	}
	
	@Test
	@DisplayName("Comparing two  rectangle with int values")
	void testCompairingRectangle() {
		Rectangle rec1=new Rectangle(2,4);
		Rectangle rec2=new Rectangle(2,4);
		assertEquals(true,Rectangle.isAreaEqual(rec1,rec2));
	}
}
