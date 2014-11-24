public class Supermarket {

		public static void main(String [] args){
			Supermarket supMar = new Supermarket();
			supMar.run();

		}

		public void run(){
			Person per1 = new Person("John");
			addPerson(per1);
			Person per2 = new Person("Simon");
			addPerson(per2);
			Person per3 = new Person("Mike");
			addPerson(per3);
			Person per4 = new Person("Dave");
		}


		public void addPerson(Person person){
				person.insert(person);
		}

		public Person servePerson(){
				Person nextPer = null;
				//nextPer.retrieve();
				return nextPer;

		}
}