public class MyScript{
	
	public static void main(String[] args){
		MyScript newScript = new MyScript();
		newScript.run();
	}

	public void run(){
		IntegerTreeNode myTree = new IntegerTreeNode(11);
		myTree.add(12);
		myTree.add(9);
		myTree.add(15);
		myTree.add(19);
		myTree.add(21);
		myTree.add(7);
		myTree.add(5);
		myTree.add(4);
		myTree.add(100);
		int x = myTree.getMax();
		System.out.println(x);
		int y = myTree.getMin();
		System.out.println(y);
		String strOut1 = myTree.treeToString1(myTree);
		System.out.println("[" + strOut1 + "]");
		String strOut2 = myTree.treeToString2(myTree);
		System.out.println(strOut2);
		int z = myTree.depth();
		System.out.println("The depth of the tree is: " + z);
		
	}
}