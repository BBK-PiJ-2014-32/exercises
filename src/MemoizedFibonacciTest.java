import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MemoizedFibonacciTest {

	@Test
	public void nonMenFibTest1() {
		MemoizedFibonacci nonMemFib = new MemoizedFibonacci();
		int output = nonMemFib.fib(40);
		int expected = 102334155;
		assertEquals(expected, output);
	}
	
	@Test
	public void nonMenFibTest2() {
		MemoizedFibonacci nonMemFib = new MemoizedFibonacci();
		int output = nonMemFib.fib(45);
		int expected = 1134903170;
		assertEquals(expected, output);
	}
	
	@Test
	public void memFibTest() {
		MemoizedFibonacci fibMem = new MemoizedFibonacci();
		int output = fibMem.memFib(40);
		int expected = 102334155;
		assertEquals(expected, output);
	}
	
	@Before
	public void setup(){
		MemoizedFibonacci memoizedFib = new MemoizedFibonacci();
		memoizedFib.intoPrecalculatedArray(50);
	}
	
	@Test
	public void memoizedFibTest(){
		MemoizedFibonacci memoizedFib = new MemoizedFibonacci();
		int output = memoizedFib.memFib(45);
		int expected = 1134903170;
		assertEquals(expected, output);
	}
}
