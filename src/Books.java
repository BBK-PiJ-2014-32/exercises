
// TODO: Auto-generated Javadoc
/**
 * The Class Books.
 */
public class Books implements Book {

	/** The author. */
	private String author;
	
	/** The title. */
	private String title;
	
	/**
	 * Instantiates a new books.
	 *
	 * @param author the author
	 * @param title the title
	 */
	public Books(String author, String title){
		this.author = author;
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see Book#getAuthor()
	 */
	public String getAuthor(){
		return author;
	}
	
	/* (non-Javadoc)
	 * @see Book#getTitle()
	 */
	public String getTitle(){
		return title;
	}
}
