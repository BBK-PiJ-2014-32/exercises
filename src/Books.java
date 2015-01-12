
public class Books implements Book {

	private String author;
	private String title;
	
	/**
	 * @param author
	 * @param title
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
