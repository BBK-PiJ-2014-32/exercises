import java.util.Arrays;
import java.util.LinkedList;

public class FromArrayToList {

		public static void main(String[] args){

				int [] array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

				ListUtilities arrayIn = new ListUtilities(array1);

				LinkedList list = new LinkedList();
				list = arrayIn.newList(array1);

			}
}