package labAssignmentQ3_BOOK;

import java.util.List;
public class TesterQ3 {

public static void main(String[] args) {
		
		Book book = new Book(1, "head first java", "kiety sierra");
		Book book1 = new Book(2, "java 8 in action", "mercika");
		Book book3 = new Book(3, "let's us c", "Yaswanth kanethkar");
		
		
		
		BookCollection bookCollection = new BookCollection();
		bookCollection.bookList.add(book);
		bookCollection.bookList.add(book1);
//		bookCol.bookList.add(book2);
		bookCollection.bookList.add(book3);
		
		System.out.println("---------------before sorting---------------");
		printBooks(bookCollection.bookList);
		
		//check whether book is there or not
		Book bookUpdate = new Book("ikigai", "george");
		bookCollection.hasBook(bookUpdate);
		
		//sort
		System.out.println("---------------after sorting by book title---------------");
		bookCollection.sortByBookName();
		

		System.out.println("---------------after sorting by author ---------------");
		bookCollection.sortByAuthor();
	}
	
	private static void printBooks(List<Book> bookList) {
		//print the book
		for(Book book: bookList) {
			System.out.println(book);
		}
	}

}
