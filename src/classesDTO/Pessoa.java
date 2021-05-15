package classesDTO;

public class Pessoa {
	private String nome;
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n------------");
		builder.append("\nNome: ");
		builder.append(nome);
		return builder.toString();
	}
	
	
}
