public class StringExtension extends String{

	public void printEven(String str){
		for(int x = 0; x < str.length(); x++){
			if (x % 2 == 0){
				System.out.println(str.charAt(x));
			}
		}
	}

}