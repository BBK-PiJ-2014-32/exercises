import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class StringStackTest {
	@Test
	public void testPushAndPop(){
		StringStack myStack = new PointerStringStack();
		myStack.push("testInput");
		String output = myStack.pop();
		String expected = "testInput";
		assertEquals(output, expected);
	}	
}
