package entities;

import java.util.Objects;

import entities.exception.LibraryException;

public class Book {

	private String title;
	private String author;
	private boolean isAvailable; 

	public Book() {
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true; 
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	
	public void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("O livro '" + title + "' foi emprestado com sucesso.");
		} else {
			throw new LibraryException("O livro '" + title + "' já está emprestado.");
		}
	}

	
	public void returnBook() {
		if (!isAvailable) {
			isAvailable = true;
			System.out.println("O livro '" + title + "' foi devolvido com sucesso.");
		} else {
			throw new LibraryException("O livro '" + title + "' já está disponível e não pode ser devolvido.");
		}
	}

	
	@Override
	public String toString() {
		return "'" + title + "' de " + author + " (Disponível: " + (isAvailable ? "Sim" : "Não") + ")";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title) && Objects.equals(author, other.author);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, author);
	}
}