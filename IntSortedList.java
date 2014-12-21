public interface IntSortedList{

	//adds a new int to the set; if it is there already, nothing happens.
	void add(int newNumber);
	
	//returns true if the number is in the set, false otherwise.
	boolean contains(int newNumber); 

	//returns a string with the values of the elements in the set separated by commas.
	String toString();
}