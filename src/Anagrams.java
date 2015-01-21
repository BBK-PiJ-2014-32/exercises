import java.util.ArrayList;import java.util.List;


public class Anagrams {

	public static String create(String input){
		if(input.length() == 1){
			return input;
		} else {
			for(int i = 0; i < input.length(); i++){
				String str = Character.toString(input.charAt(i));
				for(int j = input.length()-1; j > 0; j--){
					str = str + Character.toString(input.charAt(j));
					System.out.println(str);
					System.out.println("1 " + input.substring(0, i) + input.substring(i));
					
				}	
			}
		} return input;
	}
	
	
	/**public static List<String> anagramCreator (String input, String first){
		ArrayList<String> anagList = new ArrayList<>();
		if(input.length() == 0) {
			anagList.add(first);
			System.out.println(anagList.size());
		}	for(int i = 0; i < input.length(); i++) {
			System.out.println(anagList.size());
				create(input.substring(0, i) + input.substring(i+1, input.length()), input.charAt(i) + first);
			}return anagList;
	}

	public static String create(String input, String first){
		
		if(input.length() == 0) {
			System.out.print(first);
			return first;
		}	for(int i = 0; i < input.length(); i++) {
			System.out.println("1st " + input.substring(0, i));
			System.out.println("2nd " + input.substring(i+1, input.length()));
			System.out.println("3rd " + input.charAt(i) + first);
				System.out.println("create " + create(input.substring(0, i) + input.substring(i+1, input.length()), input.charAt(i) + first));
				return null;
			}
		return null;
		}*/
		
	public static void main(String[] args){
		Anagrams ana = new Anagrams();
		System.out.println(ana.create("abc"));
		
		
	}

}