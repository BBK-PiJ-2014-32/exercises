import static org.junit.Assert.*;

import org.junit.Test;

import day13.Book;


// TODO: Auto-generated Javadoc
/**
 * The Class BookTest.
 */
public class BookTest {

	/**
	 * Test get author.
	 */
	@Test
	public void testGetAuthor() {
		Book myBook = new Books("Anon", "a book");
		String output = myBook.getAuthor();
		String expected = "Anon";
		assertEquals(output, expected);
	}
	
	/**
	 * Test get title.
	 */
	@Test
	public void testGetTitle() {
		Book myBook = new Books("Anon", "a book");
		String output = myBook.getTitle();
		String expected = "a book";
		assertEquals(output, expected);
	}
}
