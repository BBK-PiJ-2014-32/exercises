public class Person {
	private String name;
	private Person next;
	private Person head;
	private int count;

	public Person(String name){
		this.name = name;
		this.next = null;
		this.head = null;
		count = 0;
		}



	public String getName(){
		String str = this.name;
		return str;
	}

	public Person getNext(){
			return this.next ;
		}

	public void setNextPerson(Person person){
		if (this.next == null){
				this.next = person;
		} else {
			  	this.next.setNextPerson(person);
		}
		count++;
    }

}