import static org.junit.Assert.*;

import org.junit.Test;


// TODO: Auto-generated Javadoc
/**
 * The Class LibraryUserTest.
 */
public class LibraryUserTest {

	/**
	 * Test name.
	 */
	@Test
	public void testName() {
		LibrayUser newUser = new LibraryUserImpl("Someone");
		String output = newUser.getName();
		String expected = "Someone";
		assertEquals(output, expected);
	}
	
	/**
	 * Test user id, by first setting it and then getting it.
	 */
	@Test
	public void testGetSetUserID() {
		LibrayUser newUser = new LibraryUserImpl("Someone");
		newUser.setUserID(2364);
		int output = newUser.getUserID();
		int expected = "2364";
		assertEquals(output, expected);
	}
	
}
