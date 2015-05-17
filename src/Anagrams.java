import java.util.ArrayList;import java.util.List;


public class Anagrams {

	private static ArrayList<String> anaList = new ArrayList<>();
	
	public Anagrams(){
		this.anaList = anaList;
	}
		
	public static ArrayList<String> create(String prefix, String input){
		if(input.length() == 0){
			anaList.add(prefix);
		} else {
			for(int i = 0; i < input.length(); i++){
					create((prefix + input.charAt(i)), (input.substring(0, i) + input.substring(i+1)));
			}	
		} return anaList;
	}
	
	public static void main(String[] args){
		Anagrams ana = new Anagrams();
		System.out.println(ana.create("", "every"));
		
		
	}

}