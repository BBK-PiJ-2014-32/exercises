
public interface LibraryUser {

	/*
	 * sets the ID of the user
	 */
	void setUserID();
	
	/*
	 * returns the name of the library user
	 */
	String getName();
	
	/*
	 * returns the userID, if not yet set 0 is returned
	 */
	int getUserID();
}


