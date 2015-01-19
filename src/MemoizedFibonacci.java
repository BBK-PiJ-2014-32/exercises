
public class MemoizedFibonacci {
	private int[] precalculated = null;
	
	public static void main(String[] args){
	System.out.println("Please enter a number: ");
	String str = System.console().readLine();
	int x = Integer.parseInt(str);
	int result = fib(x);
	System.out.println("The " + x + "th term of the Fibonacci sequence is " + result);
	}
	
	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2);
			return result;
			}
		}
	
	public static int memFib(int n){
		if (precalculated == null){
			
		}
	}
	
	public void intoPrecalculatedArray(int size){
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++){
			precalculated[i] = -1;
		}
		precalculated[0] = 1;
		precalculated[1] = 1;
		
	}
}
