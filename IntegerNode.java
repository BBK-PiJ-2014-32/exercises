public class IntegerNode {
    private int n;
    private IntegerNode next;

    public IntegerNode(int n) {
	  this.n = n;
	  this.next = null;
    }

    public int getNumber() {
	  return n;
    }

    public IntegerNode getNext() {
	  return next;
    }

    public void setNext(IntegerNode n) {
	  		if (this.next == null){
				this.next = n;
		} else {
	  			this.next.setNext(n);
			}
    }

    public void printList(){
			System.out.println(n);
				if (next != null){
					next.printList();
			}
		}
}