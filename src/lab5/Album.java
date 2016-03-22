package lab5;

import java.util.ArrayList;

public class Album {

	private String artista;
	private String titulo;
	private int anoDeLancamento;
	private boolean favorito;
	private ArrayList<Musica> musicas;
	
	
	public Album(String artista, String titulo, int anoDeLancamento, boolean favorito) throws Exception{
		this.artista = artista;
		this.titulo = titulo;
		this.anoDeLancamento = anoDeLancamento;
		this.favorito = favorito;
		this.musicas = new ArrayList<Musica>();
		
		if(artista == null || artista.equals("")){
			throw new Exception("Artista do album nao pode ser nulo ou vazio.");
		}
		if(titulo == null || titulo.equals("")){
			throw new Exception("Titulo do album nao pode ser nulo ou vazio.");
		}
		
		if(anoDeLancamento < 1900){
			throw new Exception("Ano de lancamento nao pode ser menor que 1900");
		}
		
	}
	
	public boolean adicionaMusica(Musica musica) throws Exception{
		if(musica == null){
			throw new Exception("A musica nao pode ser nula");
		}
		musicas.add(musica);
		return true;

	}
	
	public int getDuracaoAlbum(){
		int tempoTotal = 0;
		for (Musica musica : musicas){
			
			tempoTotal += musica.getDuracao();
		}return tempoTotal;
	}
	
	public boolean removeMusica(String nome){
		for (Musica musica : musicas){
			if(musica.getTitulo().equals(nome)){
				musicas.remove(musica);
				return true;
			}else{
				return false;
			}
		}
		return false;		
	}
	
	
	
	public boolean getMusicaPorNome(String nome){
		for (Musica musica : musicas){
			if (musica.getTitulo().equals(nome)){
				return true;
			}else{
				return false;
			}
		}return false;
	}
	
	public Musica getMusicaPorIndice(int index) throws Exception{
		return musicas.get(index - 1);
	}
	
	public Musica getMusica(){
		for(Musica musica : musicas){
			return musica;
		}
		return null;
	}
	
	
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artista == null) ? 0 : artista.hashCode());
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
		Album other = (Album) obj;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	public boolean seEFavorito(boolean favorito){
		if(favorito == true){
			return true;	
		}else{
			return false;
		}
	}

	@Override
	public String toString() {
		return titulo + " " + artista + " " + anoDeLancamento + " " + favorito;
	}
}