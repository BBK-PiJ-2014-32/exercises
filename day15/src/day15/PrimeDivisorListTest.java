package day15;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeDivisorListTest {

	@Test
	public void primeListTest() {
		PrimeDivisor newList = new PrimeDivisorList();
		newList.add(5);
		newList.add(5);
		newList.add(7);
		newList.add(13);
		newList.add(1);
		newList.remove(0);
		String out = newList.toString();
		String expected = "[ 5 * 7 * 13 * 1 = 455 ]";
	}

}
