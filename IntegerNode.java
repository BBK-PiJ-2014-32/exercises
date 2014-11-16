public class IntegerNode {
    private int n;
    private IntegerNode next;
	private IntegerNode temp;

    public IntegerNode(int n) {
	  this.n = n;
	  this.next = null;
	  this.temp = null;
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
    public void setNextSort(IntegerNode newNode) {
	  		if (newNode.n >= this.n){
		  		if (this.next == null){
					this.next = newNode;
			} else {
		  			this.next.setNextSort(newNode);
				}
		} else {
			int x = this.n;
			temp = this.next;
			this.n = newNode.n;
			newNode.n = x;
			this.next = newNode;
			this.next.next = temp;
			}
    }
    public void printList(){
			System.out.println(n);
				if (next != null){
					next.printList();
			}
		}
}