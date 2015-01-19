import java.util.ArrayList;
import java.util.List;


public class Anagrams {

	private static ArrayList<String> anagramList = null;
	
	public static List<String> anagramCreator(String input){
	List<String> anaList = new ArrayList<>();
	char first = input.charAt(0);
	String rest = input.substring(1);
	
		List<String> anagrams = anagramCreator(rest);
			for (String str : anagrams){
				for (int i = 0; i <= str.length(); i++){
					anaList.add(insertChar(str, first, i));
				}
			}
		return anaList;	
	}
	
	public static String insertChar(String str, char c, int j){
		String start = str.substring(0, j);
		String end = str.substring(j);
		return start + c + end;
	}

	public static void main(String[] args){
		System.out.println(anagramCreator("tes"));
	}
}