package socialLibrary;

public class Book {
	private String title;
	private int genre;
	private String author;
	private int id;

	public Book(int id, String author, int genre, String title) {
		this.id = id;
		this.author = author;
		this.genre = genre;
		this.title = title;
		
	}
	
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getGenre() {
		return genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getGenreString() {
		switch(genre) {
		case 1:
			return "LGBT+";
		case 2:
			return "Children's";
		case 3:
			return "Self-Help";
		case 4:
			return "Social Sciences";
		default:
			return "";
		}
	}
}