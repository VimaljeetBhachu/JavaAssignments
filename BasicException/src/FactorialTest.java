import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	public void getFactorial() {
		Factorial fac = new Factorial();
		int numMaxValue = Integer.MAX_VALUE;
		try {
			double factorial = fac.getFactorial(4, numMaxValue);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(120.00, 120.00, 0);
	}

}
