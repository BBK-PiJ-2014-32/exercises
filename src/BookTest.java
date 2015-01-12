import static org.junit.Assert.*;

import org.junit.Test;


public class BookTest {

	@Test
	public void testGetAuthor() {
		Book myBook = new Books("Anon", "a book");
		String output = myBook.getAuthor();
		String expected = "Anon";
		assertEquals(output, expected);
	}

	public void testGetTitle() {
		Book myBook = new Books("Anon", "a book");
		String output = myBook.getTitle();
		String expected = "a book";
		assertEquals(output, expected);
	}
}
