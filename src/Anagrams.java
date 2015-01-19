import java.util.ArrayList;import java.util.List;


public class Anagrams {

	private static ArrayList<String> anagramList = new ArrayList<>();
	
	public static List<String> anagramCreator (String input){
	anagramList.add(create(input, ""));
	return anagramList;
	}

	public static String create(String input, String first){
		if(input.length() == 0) {
			return first;
		}	for(int i = 0; i < input.length(); i++) {
				String str = create(input.substring(0, i) + input.substring(i+1, input.length()), input.charAt(i) + first);
				anagramList.add(str);
				return str;
			}
		return null;
		}
		
	public static void main(String[] args){
		Anagrams ana = new Anagrams();
		ana.anagramCreator("tea");
		System.out.println(anagramList.size());
		for (int i = 0; i < anagramList.size(); i++){
			System.out.println(anagramList.get(i));
		}
	}

}