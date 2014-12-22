public class ListIntSortedList implements IntSortedList {

	private int value;
	private ListIntSortedList next;
	private ListIntSortedList temp;

    public ListIntSortedList(int n) {
	  this.value = n;
	  this.next = null;
	  this.temp = null;
    }

    public void add(int n) {
		if (n >= this.value){
			if (this.next == null){
					this.next = new ListIntSortedList(n);
			} else {
			  		this.next.add(n);
			}

		} else {
			temp = this.next;
			this.next = new ListIntSortedList(n);
			this.next.next = temp;
		}

	}

	public boolean contains(int newNumber){
		if (value == newNumber){
			return true;
		} else if (value != newNumber){
			return false;
		} else {
			next.contains(newNumber);
		}
		return false;

	}

 	public int getNext() {
		  return next.value;
    }

    public String toString(){
			String str = "";
				if (next == null){
					str += value + ".";
					return str;
				}
			str +=	value + ", " + next.toString();
			return str;
		}
}