public class Stack {

	private IntegerNode top = null;
	private int count = 0;

	public Stack(){
		this.top = top;
		this.count = count;
	}

		public void push(IntegerNode newNode) {
			if (this.top == null){
				this.top = newNode;
    	} else {
				IntegerNode nextInLine = this.top;
				this.top = newNode;
				this.top.setNextTop(nextInLine);
			}

		count++;
    }


		public IntegerNode pop(){
			while (isEmpty() != true){
					IntegerNode nextInLine = this.top;
					this.top = this.top.getNextTop();
					count--;
					return nextInLine;
					}
			return null;
		}

		public int size(){
			return count;

		}

		public boolean isEmpty(){
			if (top == null){
				return true;
			}
			return false;
		}
}
