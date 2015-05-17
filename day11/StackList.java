public interface StackList<Number>{

	void push(Number object);
	
	StackNode<Number> pop();
	
	boolean isEmpty();

}