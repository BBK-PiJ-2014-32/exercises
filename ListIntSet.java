public class ListIntSet implements IntSet {

	private int value;
	private ListIntSet next;

    public ListIntSet(int n) {
	  this.value = n;
	  this.next = null;
    }

    public void add(int n) {
	  	if (next == null){
				next = new ListIntSet(n);
		} else {
	  			next.add(n);
		}
    }

	public boolean contains(int newNumber){
		if(this.value == newNumber){
			return true;
		} else if (this.value != newNumber);
			this.next.contains(newNumber);
		return false;
	}

	public boolean containsVerbose(int newNumber){
		return false;
	}

    public String toString(){
			String str = "";
				if (next == null){
					return str;
				}
			str +=	value + ", " + next.toString();
			return str;
		}
}