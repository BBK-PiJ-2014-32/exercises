public class LinkedListImp<T> implements LinkedList<T> {

	private T value;
    private Node<T> first;
    private Node<T> next;
	private Node<T> previous;

    public LinkedListImp() {
	  first = new NodeImp(null);

    }

    public void add(T object) {
	if (this.next == null){
	  			this.next = object;
	  			this.next.previous = this;
	  		} else {
	  			this.next.add(object);
	  		}
	  }

}

