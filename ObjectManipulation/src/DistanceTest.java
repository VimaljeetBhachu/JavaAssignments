import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class DistanceTest {

	DistanceDemo distanceObject = new DistanceDemo();
	DistanceDemo distantObject = new DistanceDemo();
	@Test
	@DisplayName("Test No.1")
	void test1() {
		distanceObject.set(2, 5.1f);
		assertEquals(2,distanceObject.getFeet());
		assertEquals(5.1f,distanceObject.getInches());
	}

	@Test
	@DisplayName("Test no.2")
	void test2() {
		distanceObject.set(2, 5.1f);
		distantObject.set(3, 9.3f);
		DistanceDemo dis3=DistanceDemo.sum(distanceObject, distantObject);
		dis3.display();
		assertEquals(5,dis3.getFeet());
		assertEquals((14.2f + 0.2f),dis3.getInches());
	}

}
