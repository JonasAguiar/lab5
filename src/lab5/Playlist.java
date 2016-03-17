package lab5;

import java.util.HashMap;

public class Playlist {

	private String nome;
	private HashMap<String, Musica > musicas;
	
	//FALTA EXCEPTIONS
	public Playlist(String nome){
		this.nome = nome;
		musicas = new HashMap<String, Musica>();
	}

	public int getDuracaoPlayList(){
		int duracao = 0;
		for(int i=0; i < musicas.size(); i++){
			duracao += musicas.get(i).getDuracao();
		}
		
		return duracao;
	}
	
	public boolean adicionaMusica(Musica musica){
		if(musica.equals("") || musica == null ){
			return false;
		}else{
			musicas.put(nome, musica);
			return true;
		}
	}
	
	public boolean removeMusicaPorNome(String nome){
		for(int i = 0; i < musicas.size(); i++){
			if(musicas.get(i).equals(nome)){
				musicas.remove(nome);
				return true;
			}else{
				return false;
			}
		}return false;
	}
	
	public boolean removeMusicaPorObjeto(Musica musica){
		for(int i = 0; i < musicas.size();i++){
			if(musicas.get(i).equals(musica)){
				musicas.remove(i, musica);
				return true;
			}else{
				return false;
			}
		}return false;
	}
	
	public boolean pesquisaMusica(String nome){
		for(int i = 0; i < musicas.size(); i++){
			if(musicas.get(i).equals(nome)){
				return true;
			}else{
				return false;
			}
		}return false;
	}
		
	public String getNome() {
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

