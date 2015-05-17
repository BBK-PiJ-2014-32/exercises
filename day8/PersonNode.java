public class PersonNode {
    private Person per;
    private PersonNode next;

    public PersonNode(Person per) {
	  this.per = per;
	  this.next = null;
    }

    public Person getNumber() {
	  return per;
    }

    public PersonNode getNext() {
	  return next;
    }

    public void setNext(PersonNode per) {
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