public class Queues {

	private Queue newQueue = null;

	public static void main(String[] args){

		Queues AQueue = new Queues();
		AQueue.launch();
	}

		//add ints.
		public void launch(){
			IntegerNode l1 = new IntegerNode(45);
			newQueue.head = l1;
			IntegerNode l2 = new IntegerNode(22);
			newQueue.insert(l2);
			IntegerNode l3 = new IntegerNode(30);
			newQueue.insert(l3);
			IntegerNode l4 = new IntegerNode(41);
			newQueue.insert(l4);
			IntegerNode l5 = new IntegerNode(18);
			newQueue.insert(l5);
			IntegerNode l6 = new IntegerNode(12);
			newQueue.insert(l6);
			IntegerNode l7 = new IntegerNode(75);
			newQueue.insert(l7);
			IntegerNode l8 = new IntegerNode(36);
			newQueue.insert(l8);
			IntegerNode l9 = new IntegerNode(25);
			newQueue.insert(l9);
			IntegerNode l10 = new IntegerNode(26);
			newQueue.insert(l10);
	}




}