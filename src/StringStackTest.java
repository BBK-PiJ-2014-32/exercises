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
	
	@Test
	public void testPeek(){
		StringStack myStack = new PointerStringStack();
		myStack.push("testInput1");
		myStack.push("testInput2");
		myStack.push("testInput3");
		myStack.push("testInput4");
		String output = myStack.peek();
		String expected = "testInput4";
		assertEquals(output, expected);
		
	}	
	
	@Test
	public void testIsEmpty(){
		StringStack myStack = new PointerStringStack();
		Boolean output = myStack.isEmpty();
		Boolean expected = true;
		assertEquals(output, expected);
	}
}
