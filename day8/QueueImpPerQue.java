public class QueueImpPerQue implements PersonQueue {

	private Person head;
	private int count = 0;

	public QueueImpPerQue(){
		this.head = null;
		this.count = count;
	}

		public void insert(Person person) {
			if (this.head == null){
				this.head = person;
    		} else {
				if (this.head.getNext() == null){
							this.head.setNextPerson(person);
					} else {
				  			this.head.setNextPerson(person);
			}

		}
		count++;
    }


	public Person retrieve(){
		Person nextInLine = this.head;
		this.head = this.head.getNext();
		count--;
		return nextInLine;
		}

		public int size(){
			return count;

		}

	}