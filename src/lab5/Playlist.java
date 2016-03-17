package lab5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Playlist {

	private String nome;
	//nao precisar ser mapa
	private Set<Musica> musicas;
	
	//FALTA EXCEPTIONS
	public Playlist(String nome) throws Exception{
		if(nome == null || nome.equals("")){
			throw new Exception("O nome da playlist nao pode ser nulo ou vazio.");
		}
		this.nome = nome;
		musicas = new HashSet<Musica>();
	}

	public int getDuracaoPlayList(){
		int duracao = 0;
		for(Musica musica: musicas){
			duracao += musica.getDuracao();
		}
		
		return duracao;
	}
	
	public boolean adicionaMusica(Musica musica) throws Exception{
		if(musica == null){
			throw new Exception("A musica nao pode ser nula.");
		}
		musicas.add(musica);
		return true;
	}
	
	public boolean removeMusicaPorNome(String nome){
		for(Musica musica : musicas){
			if(musica.equals(nome)){
				musicas.remove(musica);
				return true;
			}
		}return false;
	}
	
	public boolean removeMusicaPorObjeto(Musica musica){
		if(musicas.contains(musica)){
			musicas.remove(musica);
			return true;
		}return false;
	}
	
	public boolean pesquisaMusica(String nome){
		for(Musica musica : musicas){
			musica.getTitulo().equals(nome);
			return true;
		}return false;
	}
		
	public String getNome(){
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((musicas == null) ? 0 : musicas.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Playlist other = (Playlist) obj;
		if (musicas == null) {
			if (other.musicas != null)
				return false;
		} else if (!musicas.equals(other.musicas))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
}

