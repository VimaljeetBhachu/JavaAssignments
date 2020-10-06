import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class FacebookLikesSystemTest {

	@Test
	@DisplayName("No one Likes This :(")
	void test1() {
		String actual=FacebookLikeSystem.facebookLikes(new String[]{});
		String expected="no one likes this";
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Peter Likes This :)")
	void test2() {
		String actual=FacebookLikeSystem.facebookLikes(new String[]{"Peter"});
		String expected="Peter likes this";
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Jacob and Alex Likes This :)")
	void test3() {
		String actual=FacebookLikeSystem.facebookLikes(new String[]{"Jacob", "Alex"});
		String expected="Jacob and Alex likes this";
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Max, John and Mark Likes This :)")
	void test4() {
		String actual=FacebookLikeSystem.facebookLikes(new String[]{"Max", "John", "Mark"});
		String expected="Max, John and Mark likes this";
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Alex, jacob and 2 others Likes This :)")
	void test5() {
		String actual=FacebookLikeSystem.facebookLikes(new String[]{"Alex", "Jacob", "Mark", "Max"});
		String expected="Alex, Jacob and 2 others likes this";
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Alex, Jacob and 4 others Likes This :)")
	void test6() {
		String actual=FacebookLikeSystem.facebookLikes(new String[]{"Alex", "Jacob", "Mark", "Max","Joey","Chandler"});
		String expected="Alex, Jacob and 4 others likes this";
		assertEquals(expected,actual);
	}

}
