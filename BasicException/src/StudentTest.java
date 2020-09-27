import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	public void checkAge() {
		//fail("Not yet implemented");
		Student st = new Student(116, "Vimaljeet", 20, "IT");
		int age = 0;
		try {
			age = st.checkAge(20);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(20, age, 0);
	}
	
	@Test
	public void checkName() {
		Student st = new Student(116, "Vimaljeet", 20, "IT");
		String name = null;
		try {
			name = st.checkName("Vimaljeet");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Vimaljeet", name);
		
	}
	
	@Test
	public void studentInfo() {
		Student st = new Student(116, "Vimaljeet", 20, "IT");
		System.out.println("Code Fully Executed and Checked");
	}

}
