public class Stack {

	private IntegerNode end = null;
	private int count = 0;

	public Stack(){
		this.end = end;
		this.count = count;
	}

		public void push(IntegerNode newNode) {
			if (this.end == null){
				this.end = newNode;
    	} else {
				this.end.setNext(newNode);
				this.end = newNode;
			}

		count++;
    }


		public IntegerNode pop(){
					IntegerNode nextInLine = this.end;
					this.end = this.end.getNext();
					count--;
					return nextInLine;
				}

		public int size(){
			return count;

		}

		public void empty(){

		}
}
