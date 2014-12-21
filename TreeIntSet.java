public class TreeIntSet implements IntSet{
	int value;
	TreeIntSet left;
	TreeIntSet right;

	public TreeIntSet(int newNumber){
		value = newNumber;
	}

	public void add(int newNumber){
		if (contains(newNumber) != true){
			if (newNumber > this.value) {
					if (right == null) {
						right = new TreeIntSet(newNumber);
					} else {
						right.add(newNumber);
						}
				} else {
					if (left == null) {
						left = new TreeIntSet(newNumber);
					} else {
						left.add(newNumber);
					}
			}
		} else {
			System.out.println("The tree already contains: " + newNumber + ". Please select another.");
		}
	}
	public boolean contains(int n){
		if (n == this.value) {
				return true;
		} else if (n > this.value) {
				if (right == null) {
					return false;
				} else {
					return right.contains(n);
				}
		} else {
				if (left == null) {
					return false;
				} else {
					return left.contains(n);
				}
		}
	}


	public boolean containsVerbose(int n){
		System.out.println(this.value);
		if (n == this.value) {
				return true;
		} else if (n > this.value) {
				if (right == null) {
					return false;
				} else {
					//System.out.println(this.value);
					return right.containsVerbose(n);
				}
		} else {
				if (left == null) {
					return false;
				} else {
					//System.out.println(this.value);
					return left.containsVerbose(n);
				}
		}
	}

	public String toString(){
		    String str = "";
		       if(right == null && left == null) {
				  return str;
		       }
		       str += left.toString() + ", " + right.toString() + ", ";
		       return str;
	}
}
