package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books;
	private List<User> users = new ArrayList<>();

	public Library() {
		this.books = new ArrayList<Book>();
	}

	public void registerBook(Book book) {
		books.add(book);
	}

	public void registerUser(User user) {
		users.add(user);
	}

	public void getBooks() {
		for (Book books : books) {
			if (books.isBookAvailable()) {
				System.out.println(books);
			}
		}
	}

	public void getUsers() {
		for (User users : users) {
			System.out.println(users);
		}
	}
	
	public void borrowBookLibrary(Book book) {
		book.borrowBook();
		books.remove(book);
	}
	
	public void returnBookLibrary(Book book) {
		book.returnBook();
		books.add(book);
	}

}
