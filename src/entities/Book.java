package entities;

public class Book {
	
	private String title;
	private String author;
	private Boolean bookAvailable;
	
	
	public Book() {
	}

	public Book(String title, String author, Boolean bookAvailable) {
		this.title = title;
		this.author = author;
		this.bookAvailable = bookAvailable;
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


	public Boolean getBookAvailable() {
		return bookAvailable;
	}


	public void setBookAvailable(Boolean bookAvailable) {
		this.bookAvailable = bookAvailable;
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
	
	

}
