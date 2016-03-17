package lab5;

public class Musica {
	
	private String titulo;
	private int duracao;
	private String genero;
	
	public Musica(String titulo, int duracao, String genero) throws Exception{
		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;
		
		if(titulo == null || titulo.equals("")){
			throw new Exception("Titulo da musica nao pode ser nulo ou vazio.");
		}
		if(duracao <= 0){
			throw new Exception("Duracao da musica nao pode ser negativa.");
		}
		if(genero == null || genero.equals("")){
			throw new Exception("Genero da musica nao pode ser nulo ou vazio.");
		}
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duracao;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		if (duracao != other.duracao)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return titulo + " " + duracao + " " + genero;
	}
}