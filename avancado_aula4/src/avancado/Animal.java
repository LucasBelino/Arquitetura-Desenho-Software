package avancado;

public class Animal implements Comparable<Animal>{
	
	private Long id;
	private String nome;
	
	public Animal(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public int compareTo(Animal that) {
		return this.nome.compareTo( that.nome);
	}
	
	
}
