public Interface IntSet{

	//adds a new int to the set; if it is there already, nothing happens.
	void add(int);
	
	//returns true if the number is in the set, false otherwise.
	boolean contains(int); 
	
	/*returns the same values as the former method, but for every element that is checked print
	*its value on screen.
	*/
	containsVerbose(int);

	//returns a string with the values of the elements in the set separated by commas.
	String toString();
}