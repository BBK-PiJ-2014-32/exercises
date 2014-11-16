public class Person implements PersonQueue { 
	private String name;

	
	public Person(String name){
		this.name = name;
	}
	
	public void insert(Person person){
		PersonNode per = new PersonNode(person);
		PersonNode.setNext(per);
	}
	public Person retrieve(){
		
	}

}