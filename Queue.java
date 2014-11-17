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
    	} else {
				if (this.head.getNext() == null){
							this.head.setNext(newNode);
					} else {
				  			this.head.setNext(newNode);
			}

		}
		count++;
    }


		public IntegerNode retrieve(){
					IntegerNode nextInLine = this.head;
					this.head = this.head.getNext();
					count--;
					return nextInLine;
				}

		public int size(){
			return count;

		}

		public void printIt(){
			this.head.printList();
		}
}
