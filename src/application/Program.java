package application;

import java.util.Scanner;

import entities.Book;
import entities.Library;
import entities.User;

public class Program {

	private static Library library = new Library();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		initializeLibrary(); 

		while (true) {
			System.out.println("Digite 1 para acessar a área de Bibliotecário");
			System.out.println("Digite 2 para acessar a área de Usuário");
			System.out.println("Digite 0 para sair");
			int option = sc.nextInt();
			sc.nextLine(); 

			switch (option) {
				case 1:
					librarianArea();
					break;
				case 2:
					userArea();
					break;
				case 0:
					System.out.println("Encerrando o programa...");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

	
	private static void initializeLibrary() {
		Book book1 = new Book("Clean Code", "Robert C. Martin");
		Book book2 = new Book("Entendendo Algoritmos", "Aditya Y. Bhargava");
		library.registerBook(book1);
		library.registerBook(book2);
	}


	private static void librarianArea() {
		System.out.println("Você está na área do bibliotecário.");
		System.out.println("Digite o nome do Livro para cadastrar: ");
		String title = sc.nextLine();
		System.out.println("Digite o nome do Autor: ");
		String author = sc.nextLine();

		Book newBook = new Book(title, author);
		library.registerBook(newBook);
		System.out.println("Livro '" + title + "' cadastrado com sucesso.");
	}

	
	private static void userArea() {
		System.out.println("Digite seu nome: ");
		String name = sc.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = sc.nextLine();
		System.out.println("Digite seu Email: ");
		String email = sc.nextLine();

		User user = new User(name, cpf, email);
		library.registerUser(user);

		System.out.println("Bem-vindo, " + name + "! O que deseja fazer?");
		System.out.println("1. Ver livros disponíveis");
		System.out.println("2. Pegar emprestado um livro");
		System.out.println("3. Devolver um livro");

		int option = sc.nextInt();
		sc.nextLine(); 

		switch (option) {
			case 1:
				library.listAvailableBooks();
				break;
			case 2:
				borrowBook(user);
				break;
			case 3:
				returnBook(user);
				break;
			default:
				System.out.println("Opção inválida.");
		}
	}

	
	private static void borrowBook(User user) {
		System.out.println("Livros disponíveis:");
		library.listAvailableBooks();
		System.out.println("Digite o título do livro que deseja pegar emprestado:");
		String bookTitle = sc.nextLine();

		Book bookToBorrow = findBookByTitle(bookTitle);
		if (bookToBorrow != null && bookToBorrow.isAvailable()) {
			library.borrowBook(bookToBorrow, user);
			user.borrowBook(bookToBorrow);
		} else {
			System.out.println("O livro não está disponível ou não existe.");
		}
	}


	private static void returnBook(User user) {
		System.out.println("Digite o título do livro que deseja devolver:");
		String bookTitle = sc.nextLine();

		Book bookToReturn = findBookByTitle(bookTitle);
		if (bookToReturn != null && !bookToReturn.isAvailable()) {
			library.returnBook(bookToReturn, user);
			user.returnBook(bookToReturn);
		} else {
			System.out.println("O livro não está emprestado ou não existe.");
		}
	}

	
	private static Book findBookByTitle(String title) {
		
		for (Book book : library.getAllBooks()) { 
			if (book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null; 
	}
}