public class TreeIntSetTest {

	public static void main(String[] args){
		TreeIntSetTest newTree = new TreeIntSetTest();
		newTree.run();
	}

	public void run(){
		IntSet myTreeIntSet = new TreeIntSet(11);
		myTreeIntSet.add(12);
		myTreeIntSet.add(9);
		myTreeIntSet.add(15);
		myTreeIntSet.add(19);
		myTreeIntSet.add(12);
		myTreeIntSet.add(7);
		myTreeIntSet.add(5);
		myTreeIntSet.add(4);
		myTreeIntSet.add(6);
		myTreeIntSet.add(7);


	}
}