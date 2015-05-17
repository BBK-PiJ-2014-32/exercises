
// TODO: Auto-generated Javadoc
/**
 * The Interface LibraryUser.
 */
public interface LibraryUser {

	/**
	 * Sets the user id.
	 */
	void setUserID(int ID);
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getName();
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	int getUserID();
	
	/**
	 * Register.
	 *
	 * @param userLibrary the user library
	 */
	void register(Library userLibrary);
	
	/**
	 * Gets the library.
	 *
	 * @return the library
	 */
	Library getLibrary();
}


