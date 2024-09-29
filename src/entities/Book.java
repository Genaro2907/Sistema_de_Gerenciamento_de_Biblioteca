package entities;

import java.util.Objects;

public class Book {
	
	private String title;
	private String author;
	private Boolean bookAvailable;
	
	
	public Book() {
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.bookAvailable = true;
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
	
	public boolean isBookAvailable() {
        return bookAvailable;
    }

	
	//Logica para empresar o livro
	public void borrowBook() {
		if (bookAvailable) {
			bookAvailable = false;
        } else {
            throw new RuntimeException("O livro já está emprestado!");
        }	
	}
	//Logica para devolver o livro
	public void returnBook() {
		bookAvailable = true;
	}
	
	@Override
    public String toString() {
        return title + " - " + author;
    }

	@Override
	public int hashCode() {
		return Objects.hash(bookAvailable);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAvailable, other.bookAvailable);
	}
	
	
	

}
