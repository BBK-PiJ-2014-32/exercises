public class Queue {

	private IntegerNode head = null;
	private int count = 0;

	public Queue(){
		this.head = head;
		this.count = count;
	}

		public void insert(IntegerNode newNode) {
			if (this.head == null){
				this.head = newNode;
    			newNode.setNext(newNode);
		} else {
			newNode.setNext(newNode);
		}
		count++;
    }


		public IntegerNode retrieve(){
					IntegerNode nextInLine = this.head;
					this.head = nextInLine.getNext();
					count--;
					return nextInLine;
				}

		public int size(){
			return count;
		}
}