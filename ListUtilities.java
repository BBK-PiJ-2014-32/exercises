import java.util.LinkedList;
import java.util.ArrayList;

public class ListUtilities {

	private String [] arrayIn;
	private String name;
	private ListUtilities head;


		public ListUtilities (String [] arrayIn, String name){
				this.arrayIn = arrayIn;
				this.name = name;
				this.head = null;
		}

		public static LinkedList<String> newList(String [] arrayIn){
					LinkedList<String> finalList = new LinkedList<String>();
					for(int i = 0; i < arrayIn.length; i++){
						finalList.add(i, new String(arrayIn[i]));
					}



					return finalList;
			}




}