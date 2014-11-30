public class IntegerTreeNode{
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	int leftCount = 0;
	int rightCount = 0;
	
	public IntegerTreeNode(int newNumber){
		value = newNumber;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			rightCount++;
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			leftCount++;
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	public boolean contains(int n) {
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
	
	public int getMax(){
		if (right == null){
			return value;
		} 
			return this.right.getMax();
	}
	public int getMin(){
		if (left == null){
			return value;
		} 
			return this.left.getMin();
	}
	public String treeToString1(IntegerTreeNode root){
	    String str = "";
	       if(root == null) {
			  return str;
	       }
	       str += root.value;
	       str += " L[" + treeToString1(root.left) + "] R[" + treeToString1(root.right) + "]";
	       return str;
	}
	public String treeToString2(IntegerTreeNode root){
		//Not sure how to enter not enter an empty node
		}		
				
	   public int depth(){
		   if (leftCount > rightCount){
			   return leftCount;
		   } 
		   return rightCount;
	   }

}