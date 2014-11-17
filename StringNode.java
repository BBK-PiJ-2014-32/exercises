public class StringNode {
    private String per;
    private StringNode next;

    public StringNode(String per) {
	  this.per = per;
	  this.next = null;
    }

    public String getNumber() {
	  return per;
    }

    public StringNode getNext() {
	  return next;
    }

    public void setNext(StringNode per) {
	  		if (this.next == null){
				this.next = per;
		} else {
	  			this.next.setNext(per);
			}
    }
    public void printList(){
			System.out.println(per);
				if (next != null){
					next.printList();
			}
		}
}