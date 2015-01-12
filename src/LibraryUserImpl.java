
// TODO: Auto-generated Javadoc
/**
 * The Class LibraryUserImpl.
 */
public class LibraryUserImpl implements LibraryUser{

	/** The name. */
	private String name;
	
	/** The user id. */
	private int userID;
	
	/** The user library. */
	private Library userLibrary;
	/**
	 * Instantiates a new library user impl.
	 *
	 * @param name the name
	 */
	public LibraryUserImpl(String name){
		this.name = name;
		this.userLibrary = null;
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
	
	/* (non-Javadoc)
	 * @see LibraryUser#register(Library)
	 */
	public void register(Library userLibrary){
		this.userLibrary = null;
	}
	
	/* (non-Javadoc)
	 * @see LibraryUser#getLibrary()
	 */
	public Library getLibrary(){
		return null;
	}
	
	/**
	 * The Class Library.
	 */
	public class Library{
		
		/** The library name. */
		private String libraryName;
		
		/** The id. */
		private int ID;
		
		/**
		 * Instantiates a new library.
		 */
		public Library(){
			libraryName = ""
		}
	}
}
