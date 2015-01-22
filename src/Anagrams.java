import java.util.ArrayList;import java.util.List;


public class Anagrams {

	public static String create(String prefix, String input){
		if(input.length() == 0){
			return prefix;
		} else {
			for(int i = 0; i < input.length(); i++){
					create((prefix + input.charAt(i)), (input.substring(0, i) + input.substring(i+1)));
				}	
		} return prefix;
	}
	
	public static void main(String[] args){
		Anagrams ana = new Anagrams();
		System.out.println(ana.create("", "abc"));
		
		
	}

}