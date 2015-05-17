public class Comparator {

	public static void main(String[] args){
		Comparator compare = new Comparator();
		String str1 = "23";
		String str2 = "2";
		int x = compare.getMax(str1, str2);
		System.out.println(x);
	}

	public int getMax(int n, int m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

	public int getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		return getMax(n1, n2);
		}
}