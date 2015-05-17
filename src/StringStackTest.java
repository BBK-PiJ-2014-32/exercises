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
		boolean output = myStack.isEmpty();
		boolean expected = true;
		assertEquals(output, expected);
	}
	
	@Test
	public void testGetSize(){
		PointerStringStack myStack = new PointerStringStack();
		myStack.push("testInput1");
		myStack.push("testInput2");
		myStack.push("testInput3");
		myStack.push("testInput4");
		int output = myStack.getSize();
		int expected = 4;
		assertEquals(output, expected);		
	}
	
	@Test
	public void testArrayPushPop(){
		StringStack myStack = new ArrayStringStack();
		myStack.push("testInput1");
		String output = myStack.pop();
		String expected = "testInput1";
		assertEquals(output, expected);
	}
	
	@Test
	public void testArrayPeek(){
		StringStack myStack = new ArrayStringStack();
		myStack.push("testInput1");
		myStack.push("testInput2");
		myStack.push("testInput3");
		myStack.push("testInput4");
		String output = myStack.peek();
		String expected = "testInput4";
		assertEquals(output, expected);
	}
	
	@Test
	public void testArrayIsEmpty(){
		StringStack myStack = new  ArrayStringStack();
		boolean output = myStack.isEmpty();
		boolean expected = true;
		assertEquals(output, expected);
	}
	
	@Test
	public void testArrayAlmostFull(){
		ArrayStringStack myStack = new ArrayStringStack();
		myStack.push("testInput1");
		myStack.push("testInput2");
		myStack.push("testInput3");
		myStack.push("testInput4");
		myStack.push("testInput5");
		boolean output = myStack.isAlmostFull();
		boolean expected = true;
		assertEquals(output, expected);		
	}
	
	@Test
	public void testReserveMoreMemory(){
		ArrayStringStack myStack = new ArrayStringStack();
		myStack.push("testInput1");
		myStack.push("testInput2");
		myStack.push("testInput3");
		myStack.push("testInput4");
		myStack.push("testInput5");
		myStack.reserveMoreMemory();
		myStack.push("testInput6");
		myStack.push("testInput7");
		myStack.push("testInput8");
		myStack.push("testInput9");
		myStack.push("testInput10");
		String output = myStack.pop();
		String expected = "testInput10";
		assertEquals(output, expected);
	}
}
