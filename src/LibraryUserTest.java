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
		String output = myBook.getAuthor();
		String expected = "Anon";
		assertEquals(output, expected);
	}
	
	/**
	 * Test user id.
	 */
	@Test
	public void testUserID() {
		Book myBook = new Books("Anon", "a book");
		String output = myBook.getTitle();
		String expected = "a book";
		assertEquals(output, expected);

}
