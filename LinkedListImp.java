public class LinkedListImp<T> implements LinkedList<T> {

    private Node<T> first;

    public LinkedListImp() {
		Node<T> first = null;

    }

    public void add(T object) {
		if (first == null){
	 			first = new NodeImp<T>(object);
		} else {
				first.add(object);
	  		}
	  }

}

