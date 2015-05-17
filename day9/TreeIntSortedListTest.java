public class TreeIntSortedListTest {

	public static void main(String[] args){
		TreeIntSortedListTest newTree = new TreeIntSortedListTest();
		newTree.run();
	}

	public void run(){
		IntSortedList myTreeIntSorted = new TreeIntSortedList(11);
		myTreeIntSorted.add(12);
		myTreeIntSorted.add(9);
		myTreeIntSorted.add(8);
		myTreeIntSorted.add(6);
		myTreeIntSorted.add(12);
		myTreeIntSorted.add(12);
		System.out.println(myTreeIntSorted.toString());
	}
}