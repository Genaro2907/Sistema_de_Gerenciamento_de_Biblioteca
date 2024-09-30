package entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String cpf;
	private String email;

	private List<Book> borrowedBooks;

	public User() {
		this.borrowedBooks = new ArrayList<>();
	}

	public User(String name, String cpf, String email) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.borrowedBooks = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void borrowBook(Book book) {
		if (!borrowedBooks.contains(book)) {
			borrowedBooks.add(book);
			System.out.println("Livro '" + book.getTitle() + "' emprestado com sucesso!");
		} else {
			System.out.println("Você já pegou este livro emprestado.");
		}
	}

	public void returnBook(Book book) {
		if (borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			System.out.println("Livro '" + book.getTitle() + "' devolvido com sucesso!");
		} else {
			System.out.println("Este livro não está na lista de empréstimos.");
		}
	}

	public void showBorrowedBooks() {
		if (!borrowedBooks.isEmpty()) {
			System.out.println("Livros emprestados por " + name + ":");
			for (Book book : borrowedBooks) {
				System.out.println(" - " + book);
			}
		} else {
			System.out.println("Nenhum livro emprestado.");
		}
	}

	@Override
	public String toString() {
		return name + " (CPF: " + cpf + ", Email: " + email + ")";
	}
}