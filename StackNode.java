public interface StackNode<Number>{

	StackNode<Number> getNext();

	void add(Number object);

	void setNext(StackNode<Number> object);


}