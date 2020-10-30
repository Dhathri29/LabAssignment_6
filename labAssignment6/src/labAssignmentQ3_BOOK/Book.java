package labAssignmentQ3_BOOK;

import java.util.Comparator;

class sortByAuthorName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthor().compareTo(o2.getAuthor());
	}
	
}

public class Book implements Comparable<Book>{
	
	private int id;
	private String bookName;
	private String author;
	
	public Book() {
		
	}
	public Book(int id, String bookName, String author) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "Bookid=" + id + ", bookName=" + bookName + ", author=" + author ;
	}
	@Override
	public int compareTo(Book o) {
		return this.getBookName().compareTo(o.getBookName());
	}
}