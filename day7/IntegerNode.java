public class IntegerNode {
    private int n;
    private IntegerNode next;
	private IntegerNode temp;
	private IntegerNode prev;
	private int count = 0;

    public IntegerNode(int n) {
	  this.n = n;
	  this.next = null;
	  this.temp = null;
	  this.prev = null;
    }

    public int getNumber() {
	  return n;
    }

    public IntegerNode getNext() {
	  return next;
    }

     public IntegerNode getPrev() {
		  return prev;
    }

	public IntegerNode setNextTop(IntegerNode newNode) {
		  this.next = newNode;
		  return next;
	    }

	public IntegerNode getNextTop() {
			  return next;
	}

    public void setNext(IntegerNode n) {
	  		if (this.next == null){
				this.next = n;
		} else {
	  			this.next.setNext(n);
			}
			count++;
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
    public void setNextDL(IntegerNode n) {
		  		if (this.next == null){
					this.next = n;
					this.next.prev = this;
			} else {
		  			this.next.setNextDL(n);
				}
			count++;

		}

	public boolean deletePrev(IntegerNode n){
					if (this.next == null){
						return false;
					} else if (this.next.n == n.n){
						this.next = next.next;
						this.prev = prev.prev;
						return true;
					} else {
						return this.next.deletePrev(n);
					}
		}


    public void printList(){
			System.out.println(n);
				if (next != null){
					next.printList();
			}
		}
}