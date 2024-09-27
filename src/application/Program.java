package application;

import entities.Book;
import entities.Library;

public class Program {

	public static void main(String[] args) {
		
		
		Library biblioteca = new Library();
		Book livro = new Book("Teste Book", "Gabriel");
		Book livro2 = new Book("Teste Book2", "Genaro");
		
		biblioteca.registerBook(livro);
		biblioteca.registerBook(livro2);
		
		
		biblioteca.borrowBookLibrary(livro);
		
		biblioteca.getBooks();
		System.out.println("-----------------");
		
		
		biblioteca.returnBookLibrary(livro);
		
		biblioteca.getBooks();

	}

}
