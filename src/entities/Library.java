package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books;
	private List<User> users;

	public Library() {
		this.books = new ArrayList<>();
		this.users = new ArrayList<>();
	}


	public void registerBook(Book book) {
		if (!books.contains(book)) {
			books.add(book);
			System.out.println("Livro cadastrado com sucesso.");
		} else {
			System.out.println("Este livro já está cadastrado.");
		}
	}


	public void registerUser(User user) {
		if (!users.contains(user)) {
			users.add(user);
			System.out.println("Usuário cadastrado com sucesso.");
		} else {
			System.out.println("Este usuário já está cadastrado.");
		}
	}
	
	public List<Book> getAllBooks() {
	    return books;
	}


	public void listAvailableBooks() {
		boolean hasAvailableBooks = false;
		for (Book book : books) {
			if (book.isAvailable()) {
				System.out.println(book);
				hasAvailableBooks = true;
			}
		}
		if (!hasAvailableBooks) {
			System.out.println("Não há livros disponíveis no momento.");
		}
	}

	
	public void listUsers() {
		if (!users.isEmpty()) {
			for (User user : users) {
				System.out.println(user);
			}
		} else {
			System.out.println("Nenhum usuário cadastrado.");
		}
	}

	
	public void borrowBook(Book book, User user) {
		if (books.contains(book) && book.isAvailable()) {
			book.borrowBook(); 
			user.borrowBook(book); 
			System.out.println("Livro emprestado com sucesso!");
		} else {
			System.out.println("O livro não está disponível ou não pertence à biblioteca.");
		}
	}


	public void returnBook(Book book, User user) {
		if (user.getBorrowedBooks().contains(book)) {
			book.returnBook(); 
			user.returnBook(book); 
			System.out.println("Livro devolvido com sucesso!");
		} else {
			System.out.println("Este livro não foi emprestado por este usuário.");
		}
	}


	public void listBorrowedBooks() {
		boolean hasBorrowedBooks = false;
		for (User user : users) {
			if (!user.getBorrowedBooks().isEmpty()) {
				System.out.println("Usuário: " + user.getName());
				for (Book book : user.getBorrowedBooks()) {
					System.out.println(" - " + book);
				}
				hasBorrowedBooks = true;
			}
		}
		if (!hasBorrowedBooks) {
			System.out.println("Nenhum livro emprestado no momento.");
		}
	}
}