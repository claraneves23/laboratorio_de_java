package domain;

public class Pessoa {
	
	private String nome;
	private String email;
	
	public String getName() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String entrarNaSala() {
		return String.format("O aluno %s com o email %s entrou na sala", nome, email);
	}

}
