
public class MemoizedFibonacci {

	public static void main(String[] args){
	System.out.println("Please enter a number: ");
	String str = System.console().readLine();
	int x = Integer.parseInt(str);
	
	fib(x);
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
}
