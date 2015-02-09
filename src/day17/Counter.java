package day17;

public class Counter {
	private int n = 0;
	
	public void increase() {
		if (n < 1000){
			n++;
		}
		
	}
	
	public int getCount() {
		return n;
	}
}
