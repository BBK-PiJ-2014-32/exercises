public class ListIntSet implements IntSet {

	private int value;
	private ListIntSet next;

    public ListIntSet(int n) {
	  this.value = n;
	  this.next = null;
    }

    public void add(int n) {
	  	if (contains(n) != true){
	  		if (next == null){
					next = new ListIntSet(n);
			} else {
	  				next.add(n);
			}
		} else {
			System.out.println("The list already contains: " + n + ". Please select another.");
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

	public boolean containsVerbose(int newNumber){
		return false;
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