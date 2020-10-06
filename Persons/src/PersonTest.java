import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {
	
	public static void main(String[] args) {
		Person person1Object = new Person("Ram",5,6,1980);
		person1Object.display();
		Person person2Object = new Person("Shyam",2,3,1987);
		person2Object.display();
		String tempObject = person1Object.olderOne(person2Object);
		System.out.println(person1Object.olderOne(person2Object));

	}

	@Test
	void olderPerson1() {
		Person person1Object = new Person("Ram",5,6,1980);
		Person person2Object = new Person("Shyam",2,3,1987);
		assertEquals("Ram is older than Shyam by 6 Years, 8 Months, 25 Days",person1Object.olderOne(person2Object));
	}
	
	@Test
	void olderPerson2() {
		Person person1Object = new Person("Ram", 5, 6, 1987);
		Person person2Object = new Person("Shyam", 2, 3, 1980);
		assertEquals("Shyam is older than Ram by 7 Years, 3 Months, 3 Days",person2Object.olderOne(person1Object));
	}
}
