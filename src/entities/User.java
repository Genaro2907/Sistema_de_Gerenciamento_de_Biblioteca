package entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String cpf;
	private String email;

	private List<Book> borrowedBook = new ArrayList<>();

	public User() {

	}

	public User(String name, String cpf, String email) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
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

	public void borrowedBook(Book book) {
		borrowedBook.add(book);
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(" (CPF: ").append(cpf).append(") Livro emprestado: ");

		if (borrowedBook != null && !borrowedBook.isEmpty()) {
			for (int i = 0; i < borrowedBook.size(); i++) {
				sb.append(borrowedBook.get(i));
				if (i < borrowedBook.size() - 1) {
					sb.append(", ");
				}
			}
		} else {
			sb.append("Nenhum livro emprestado");
		}

		return sb.toString();
	}

}
