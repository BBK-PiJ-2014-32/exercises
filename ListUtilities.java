import java.util.LinkedList;
import java.util.ArrayList;

public class ListUtilities {

	private int [] arrayIn;
	//private int ID;
	private ListUtilities head;


		public ListUtilities (int [] arrayInD){
				this.arrayIn = arrayIn;
				//this.ID = ID;
				this.head = null;
		}

		public static LinkedList<Integer> newList(){
					LinkedList<Integer> finalList = new LinkedList<Integer>();
					for(int i = 0; i < arrayIn.length; i++){
						finalList.add(i, new Integer(arrayIn[i]));
					}



					return finalList;
			}




}