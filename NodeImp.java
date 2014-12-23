public class NodeImp<T> implements Node<T>{
    private T object;
    private T next;
    private T previous;

    public NodeImp(T object) {
	  this.object = object;
	  this.next = null;
	  this.previous = null;
    }

    public T getNext() {
	  return next;
    }

    public void setNext(T object) {
	  this.next = object;
    }

    public void setPrev(T object) {
		  this.next = object;
    }
}
