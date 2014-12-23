public interface Node<T>{

	Node<T> getNext();

	void add(T object);

	void setNext(Node<T> object);

	void setPrev(Node<T> object);

}