package socialLibrary;

import java.util.ArrayList;
import java.util.List;

public class Library {
private	List<Book> bookList;	
	
	public Library() {
		this.bookList = new ArrayList();
	}
	
	public void bookDonation(Book book) {
		this.bookList.add(book);
	}
	
	public boolean bookAdoption(int id) {
		Book book = getBook(id);
		if (book == null) {
			return false;
		} else {
			this.bookList.remove(book);	
			return true;
		}
	}
	
	public Book getBook(int id) {
		for(Book book : this.bookList) {
			if(book.getId() ==  id) {
				return book;
			}
		}
		return null;	
	}
	
	public List<Book> booksInTheLibrary() {
		return this.bookList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
}