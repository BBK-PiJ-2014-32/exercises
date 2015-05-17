public class Supermarket {
	private PersonQueue perQueue;

		public static void main(String [] args){
			Supermarket supMar = new Supermarket();
			supMar.run();

		}

		public void run(){
			perQueue = new QueueImpPerQue();
			Person per1 = new Person("John");
			Person per2 = new Person("Simon");
			Person per3 = new Person("Mike");
			Person per4 = new Person("Dave");
			addPerson(per1);
			addPerson(per2);
			addPerson(per3);
			addPerson(per4);
			System.out.println(servePerson().getName() + ", is next.");
			System.out.println(servePerson().getName() + ", is next.");
			System.out.println(servePerson().getName() + ", is next.");
			System.out.println(servePerson().getName() + ", is next.");
		}


		public void addPerson(Person person){
				System.out.println(person.getName() + ", is in the queue.");
				perQueue.insert(person);
		}

		public Person servePerson(){
				Person nextPer = perQueue.retrieve();
				return nextPer;

		}
}