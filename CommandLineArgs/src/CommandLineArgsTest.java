import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommandLineArgsTest {

	@Test
	public void addingNumbers() {
		//fail("Not yet implemented");
		CommandLineArgs clr = new CommandLineArgs();
		double total = clr.addingNumbers(50.00, 20.00, 30.00);
		assertEquals(100.00, total, 0);
	}

}
