import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class StringStackTest {
	@Test
	public void testPushAndPop(){
		StackString myStack = new PointerStringStack();
		myStack.push("testInput");
		String output = myStack.pop();
		String expected = "testInput";
		AssertEquals(output, expected);
	}	
}
