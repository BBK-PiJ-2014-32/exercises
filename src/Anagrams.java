import java.util.ArrayList;
import java.util.List;


public class Anagrams {

	public static ArrayList<String> anagramCreater(String input){
		ArrayList<String> anagramList = new ArrayList<String>();
		return anagramList;
	}
	
	public void anag(String s1, String s2)  {
        if(s1.length() == 0) {
            System.out.println(s2);
        }
	        for(int i = 0; i < s1.length(); i++) {
	            anag(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2);
	        }
	    }

	public static void main(String[] args)  {
        Anagrams ana = new Anagrams();
        ana.anag("every", "");
	    }

}
