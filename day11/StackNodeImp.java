public class StackNodeImp<T extends Number> implements StackNode<Number>{
    private T value;
    private StackNode<Number> next;

    public StackNodeImp(T object) {
	  this.value = object;
	  this.next = null;
    }

    public StackNode<Number> getNext() {
	  return next;
    }

    public void add(Number object){
		if (this.next == null){
			this.next = new StackNodeImp<Number>(object);
		} else {
			this.next.add(object);
		}
	}
}

