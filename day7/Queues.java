public class Queues {

	public static void main(String[] args){

		Queues AQueue = new Queues();
		AQueue.launch();
	}

		//add ints.
		public void launch(){
			Queue newQueue = new Queue();
			System.out.println("There are " + newQueue.size() + " requests in the queue");
			IntegerNode l1 = new IntegerNode(5);
			System.out.println("Inserting request " + l1.getNumber());
			newQueue.insert(l1);
			IntegerNode l2 = new IntegerNode(8);
			System.out.println("Inserting request " + l2.getNumber());
			newQueue.insert(l2);
			IntegerNode l3 = new IntegerNode(12);
			System.out.println("Inserting request " + l3.getNumber());
			newQueue.insert(l3);
			System.out.println("There are " + newQueue.size() + " requests in the queue");
			System.out.println("Retrieving request " + newQueue.retrieve().getNumber() + ".... done.");
			IntegerNode l4 = new IntegerNode(13);
			System.out.println("Inserting request " + l4.getNumber());
			newQueue.insert(l4);
			System.out.println("There are " + newQueue.size() + " requests in the queue");
			System.out.println("Retrieving request " + newQueue.retrieve().getNumber() + ".... done.");
			System.out.println("Retrieving request " + newQueue.retrieve().getNumber() + ".... done.");
			System.out.println("There are " + newQueue.size() + " requests in the queue");
			System.out.println("Retrieving request " + newQueue.retrieve().getNumber() + ".... done.");
			System.out.println("There are " + newQueue.size() + " requests in the queue");
	}




}