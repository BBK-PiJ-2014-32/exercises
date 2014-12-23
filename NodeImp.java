public class NodeImp<T> implements Node<T>{
    private T value;
    private Node<T> next;
    private Node<T> previous;

    public NodeImp(T object) {
	  this.value = object;
	  this.next = null;
	  this.previous = null;
    }

    public Node<T> getNext() {
	  return next;
    }

    public void add(T object){
		if (this.next == null){
			this.next = new NodeImp<T>(object);
			this.next.setPrev(this);
		} else {
			this.next.add(object);
		}
	}


    public void setNext(Node<T> object) {
	  this.next = object;
    }

    public void setPrev(Node<T> object) {
		  this.previous = object;
    }
}
