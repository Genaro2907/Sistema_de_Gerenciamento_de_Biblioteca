package application;

import entities.Book;
import entities.Library;
import entities.User;

public class Program {

	public static void main(String[] args) {
		
		Library biblioteca = new Library();
		Book livro = new Book("Clean Code", "Gabriel");
		Book livro2 = new Book("Teste Book2", "Genaro");
		User usuario1 = new User("Gabriel" ,"500.472.548-12" , "GabrielGenaro@gmail.com");
		
		biblioteca.registerBook(livro);
		biblioteca.registerBook(livro2);
		
		
		biblioteca.borrowBookLibrary(livro);
		
		biblioteca.getBooks();
		System.out.println("-----------------");
		
		
		biblioteca.returnBookLibrary(livro);
		
		biblioteca.getBooks();
		usuario1.borrowedBook(livro);
		usuario1.borrowedBook(livro2);
		System.out.println(usuario1);
		
		

	}

}
