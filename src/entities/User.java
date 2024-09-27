package entities;

public class User {
	
	private String name;
	private String cpf;
	private String email;
	private Integer phonenumber;
	
	public User() {
		
	}

	public User(String name, String cpf, String email, Integer phonenumber) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.phonenumber = phonenumber;
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

	public Integer getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	 @Override
	    public String toString() {
	        return name + " (CPF: " + cpf + ")";
	    }
	
	

}
