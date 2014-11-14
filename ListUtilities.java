import java.util.ArrayList;

public class ListUtilities {

		public static IntegerNode newList(int [] arrayIn){
					IntegerNode finalList = new IntegerNode(arrayIn[0]);
					for(int i = 0; i < arrayIn.length; i++){
						IntegerNode addItem = new IntegerNode(arrayIn[i]);
						finalList.setNext(addItem);
					}


					finalList.printList();
					return finalList;
			}



}