public class ListIntSortedListTest {

	public static void main(String[] args){
		ListIntSortedListTest newList = new ListIntSortedListTest();
		newList.run();
	}

	public void run(){
		IntSortedList myListIntSet = new ListIntSortedList(11);
		myListIntSet.add(12);
		myListIntSet.add(9);
		myListIntSet.add(8);
		myListIntSet.add(6);
		myListIntSet.add(15);
		System.out.println(myListIntSet.toString());
	}
}