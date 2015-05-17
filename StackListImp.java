public class StackListImp<T extends Number> implements StackList<Number> {

	private StackNode<Number> first;

	public StackListImp() {
		StackNode<Number> first = null;

    }
	public void push(Number object) {
		if(first == null){
			first = new StackNodeImp<Number>(object);
		} else {
			first.add(object);
		}
	}
	public StackNode<Number> pop(){
		StackNode<Number> nextInLine = this.first;
			this.first = this.first.getNext();
				return nextInLine;
	}
	public boolean isEmpty(){
		if(first == null){
			return true;
		} else {
			return false;
		}
	}  
	  

}

