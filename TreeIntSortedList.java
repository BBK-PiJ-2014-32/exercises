public class TreeIntSortedList implements IntSortedList{
	int value;
	TreeIntSortedList left;
	TreeIntSortedList right;

	public TreeIntSortedList(int newNumber){
		value = newNumber;
	}

	public void add(int newNumber){
		if (newNumber >= this.value) {
			if (this.right == null) {
					this.right = new TreeIntSortedList(newNumber);
			} else {
					this.right.add(newNumber);
			}
		} else {
			if (this.left == null) {
					this.left = new TreeIntSortedList(newNumber);
			} else {
					this.left.add(newNumber);
				}
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

	public String toString(){
		    String str = "";
		       if(right != null && left != null) {
				   str += this.value + ", ";
			       str += left.toString() + right.toString();
			   } else if (right != null && left == null){
				   str += this.value + ", ";
			       str += right.toString();
			   } else if (left != null && right == null){
				   str += this.value + ", ";
			       str += left.toString();
			   } else if (left == null && right == null){
				   str += this.value + ", ";
			   }
		       return str;
	}
}
