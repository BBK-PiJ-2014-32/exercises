import org.junit.*;
import static org.junit.Assert.*;

public class SimpleHashTest {
	@Test
	public void testsReturnNumber() {
	SimpleHash x = new SimpleHash();
		for(int j = 0; j < 2000; j++)
			int input = (int)(2000 * Math.random());
			int output = x.shortHash(input);
			int high = 1000;
			int low = 1;
			assertTrue("Error, hash too high", high >= output);
			assertTrue("Error, hash too low", low <= output);
	}
}