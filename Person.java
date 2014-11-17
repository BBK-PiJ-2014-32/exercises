public class Person implements PersonQueue {
	private String name;
	private Person head = null;
	private Person next = null;

	public Person(String name){
		this.head = head;
		this.name = name;
		this.next = next;
		}

	public void insert(Person person){
			if (this.head == null){
					this.head = person;
			} else {
					if (this.head.getNext() == null){
							this.head.setNext(person);
					} else {
				  			this.head.setNext(person);
					}
			}
		}

	public Person retrieve(){
		return this;
	}

	public void setNext(Person per) {
		  		if (this.next == null){
					this.next = per;
			} else {
		  			this.next.setNext(per);
			}
    }

	public Person getNext() {
		  return next;
	    }


}