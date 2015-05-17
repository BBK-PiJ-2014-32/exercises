public class ListIntSetTest {

	public static void main(String[] args){
		ListIntSetTest newList = new ListIntSetTest();
		newList.run();
	}

	public void run(){
		IntSet myListIntSet = new ListIntSet(11);
		myListIntSet.add(12);
		myListIntSet.add(9);
		myListIntSet.add(15);
		myListIntSet.add(19);
		myListIntSet.add(12);
		myListIntSet.add(7);
		myListIntSet.add(5);
		myListIntSet.add(4);
		myListIntSet.add(6);
		myListIntSet.add(7);
		String str = myListIntSet.toString();
		System.out.println(str);


	}
}