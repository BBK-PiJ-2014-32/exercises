import java.util.ArrayList;import java.util.List;


public class Anagrams {

	private static ArrayList<String> anagramList = new ArrayList<>();
	
	public static List<String> anagramCreator (String input, String first){
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
			return first;
		}	for(int i = 0; i < input.length(); i++) {
				System.out.println(create(input.substring(0, i) + input.substring(i+1, input.length()), input.charAt(i) + first));
				return null;
			}
		return null;
		}
		
	public static void main(String[] args){
		Anagrams ana = new Anagrams();
		List <String> anaList  = new ArrayList<>();
		System.out.println(ana.anagramCreator("tea", "").size());
		
	}

}