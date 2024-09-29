package application;

import java.util.Scanner;

import entities.Book;
import entities.Library;
import entities.User;
import entities.exception.LibraryException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Library biblioteca = new Library();
		Book livro = new Book("Clean Code", "Robert C. Martin");
		Book livro2 = new Book("Entendendo Algoritmos", "Aditya Y. Bhargava");
		System.out.println("Digite 1 para acessar a área de Bibliotecário");
		System.out.println("Digite 2 para acessar a área de Usuário");
		biblioteca.registerBook(livro);
		biblioteca.registerBook(livro2);

		int n = sc.nextInt();

		try {
			if (n == 1) {
				System.out.println("Registrar Livro");
				System.out.println("Digite o nome do Livro: ");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.println("Digite o nome do Autor: ");
				String name = sc.nextLine();
				Book newBook = new Book(title, name);
				biblioteca.registerBook(newBook);
			}
			if (n == 2) {
				System.out.println("Digite seu nome: ");
				String name = sc.nextLine();
				System.out.println("Digite seu CPF: ");
				String cpf = sc.nextLine();
				System.out.println("Digite seu Email: ");
				String email = sc.nextLine();
				User newUser = new User(name, cpf, email);
				biblioteca.registerUser(newUser);
				System.out.println("Livros Disponiveis");
				biblioteca.getBooks();
				System.out.println("Digite 1 para pegar emprestado um Livro");
				System.out.println("Digite 2 para devolver um Livro");
				int operacoes = sc.nextInt();
				switch (operacoes) {
				case 1:
					biblioteca.borrowBookLibrary(livro2);
					break;
				case 2:
					biblioteca.returnBookLibrary(livro2);
					break;
				default:
					throw new LibraryException("Numero incorreto!");
				}

			} else {
				throw new LibraryException("Numero incorreto!");
			}

		} catch (LibraryException | NullPointerException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			sc.close();
		}

	}
}
