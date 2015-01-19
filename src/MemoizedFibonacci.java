
public class MemoizedFibonacci {
	private static int[] precalculated = null;
	
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
			intoPrecalculatedArray(n);
		}	if (precalculated[n-1] != -1){
				return precalculated[n-1];
			} else {
				int result = memFib(n-1) + memFib(n-2);
				precalculated[n-1] = result;
				return result;
			}
		
	}
	
	public static void intoPrecalculatedArray(int size){
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++){
			precalculated[i] = -1;
		}
		precalculated[0] = 1;
		precalculated[1] = 1;
	}
}
