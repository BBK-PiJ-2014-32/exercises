
public class Books implements Book {

	private String author;
	private String title;
	
	public Books(String author, String title){
		this.author = author;
		this.title = title;
	}

	public String getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
}
