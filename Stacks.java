public class Stacks {

	public static void main(String[] args){

		Stacks AStack = new Stacks();
		AStack.launch();
	}

		//add ints.
		public void launch(){
			Stack newStack = new Stack();
			System.out.println("There are " + newStack.size() + " requests in the queue");
			IntegerNode l1 = new IntegerNode(5);
			System.out.println("Inserting request " + l1.getNumber());
			newStack.push(l1);
			IntegerNode l2 = new IntegerNode(8);
			System.out.println("Inserting request " + l2.getNumber());
			newStack.push(l2);
			IntegerNode l3 = new IntegerNode(12);
			System.out.println("Inserting request " + l3.getNumber());
			newStack.push(l3);
			System.out.println("There are " + newStack.size() + " requests in the queue");
			System.out.println("Retrieving request " + newStack.pop().getNumber() + ".... done.");
			IntegerNode l4 = new IntegerNode(13);
			System.out.println("Inserting request " + l4.getNumber());
			newStack.push(l4);
			System.out.println("There are " + newStack.size() + " requests in the queue");
			System.out.println("Retrieving request " + newStack.pop().getNumber() + ".... done.");
			System.out.println("Retrieving request " + newStack.pop().getNumber() + ".... done.");
			System.out.println("There are " + newStack.size() + " requests in the queue");
			System.out.println("Retrieving request " + newStack.pop().getNumber() + ".... done.");
			System.out.println("There are " + newStack.size() + " requests in the queue");
	}




}