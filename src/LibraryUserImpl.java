
// TODO: Auto-generated Javadoc
/**
 * The Class LibraryUserImpl.
 */
public class LibraryUserImpl implements LibraryUser{

	/** The name. */
	private String name;
	
	/** The user id. */
	private int userID;
	
	/**
	 * Instantiates a new library user impl.
	 *
	 * @param name the name
	 */
	public LibraryUserImpl(String name){
		this.name = name;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param ID the new user id
	 */
	public void setUserID(int ID){
		this.userID = ID;
	}
	
	/* (non-Javadoc)
	 * @see LibraryUser#getName()
	 */
	public String getName(){
		return name;
	}
	
	/* (non-Javadoc)
	 * @see LibraryUser#getUserID()
	 */
	public int getUserID(){
		return userID;
	}
}
