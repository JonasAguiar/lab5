package lab5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class Musiteca {
	
	private Album album;
	private List<Album> albuns;
	private Map<String, Playlist> playlists;
	private Set<Album> favoritos;
	
	public Musiteca(){
		this.albuns = new ArrayList<Album>();
		this.playlists = new HashMap<String, Playlist>();
		this.favoritos = new HashSet<Album>();
	}

	public boolean adicionaAlbum(Album album){
		if(!albuns.contains(album)){
			albuns.add(album);
			return true;
		}
		return false;
	}
	
	public boolean removeAlbum(Album album){
		if(albuns.contains(album)){
			albuns.remove(album);
			return true;
		}return false;
	}
	

	
	
	public Musica obtemMusicaPorIndice(String nomeAlbum, int i) throws Exception{
		verificaNome(nomeAlbum);
		for(Album album : albuns){
			if(album.getTitulo().equals(nomeAlbum)){
				return album.getMusicaPorIndice(i);
			}
		} throw new Exception("musica nao existe nessa faixa");
	}
	
	public Album getAlbumPorNome(String nome) throws Exception{
		verificaNome(nome);
		for(Album album : albuns){
			if (album.getTitulo().equals(nome)){
				return album;
			}
		}
		throw new Exception("Album nao existe.");
	}
	

	
	public boolean adicionaPlaylist(String nomePlaylist, String nomeAlbum, int faixa) throws Exception{
		verificaNome(nomePlaylist);
		if(!playlists.containsKey(nomePlaylist)){
			Playlist playlist = new Playlist(nomePlaylist);
			playlists.put(nomePlaylist, playlist);
			return true;
		}else{
			verificaNome(nomeAlbum);
			Playlist playlist = getPlaylist(nomePlaylist);
			Musica musica = obtemMusicaPorIndice(nomeAlbum, faixa);
			playlist.adicionaMusica(musica);
			return true;
			
		}
		
	}
	
	public Playlist getPlaylist(String nome) throws Exception{
		verificaNome(nome);
		for(int i=0; i < playlists.size(); i++){
			if(playlists.containsKey(nome)){
				return playlists.get(nome);
			}
		}throw new Exception("Nao contem playlist com esse nome.");
	}
	
	public boolean removePlaylist(String nome) throws Exception{
		verificaNome(nome);
		if(playlists.containsKey(nome)){
			playlists.remove(nome);
			return true;
		}
		return false;
	
	}
	
	
	public boolean pesquisaPlaylist(String nome) throws Exception{
		verificaNome(nome);
		if(playlists.containsKey(nome)){
			return true;
		}	
		return false;
	}
	
	public void verificaNome(String nome) throws Exception{
		if(nome == null || nome.equals("")){
			throw new Exception("Nao pode passar titulo vazio ou nulo.");
		}
	}
	
	public int getDuracaoPlaylist(String nome) throws Exception{
		if(playlists.containsKey(nome)){
			return getPlaylist(nome).getDuracaoPlayList();
			
		}return 0;
					
	}
	
	
	
	public boolean adicionaFavorito(String nome){
		for(Album album: albuns){
			if(album.getTitulo().equals(nome)){
				album.setFavorito(true);
				favoritos.add(album);
				return true;
				}
			
		}return false;
	}
	
	public boolean removeFavorito(String nome){
		for(Album album : favoritos){
			if(album.getTitulo().equals(nome)){
				if(!album.isFavorito()){
					album.setFavorito(false);
					favoritos.remove(album);
					return true;
				}
			}
		}return false;
	}
	
	public boolean pesquisaFavoritoPorNome(String nome){
		for(Album album : favoritos){
			if(album.getTitulo().equals(nome)){
				return true;
			}
		}return false;
	}
	
	public boolean pesquisaFavoritoPorObjeto(Album album){
		if(favoritos.contains(album)){
			return true;
		}return false;
	}
	
	public boolean getMusicaPorNome(String nome){
		return album.getMusicaPorNome(nome);
	}
	
	public boolean removeMusica(String nome){
		return album.removeMusica(nome);
	}
	
	public int getDuracaoAlbum(String nome){
		for(Album album : albuns){
			if(album.getTitulo().equals(nome)){
				return album.getDuracaoAlbum();
			}
		}
		return 0;
	}
	
	public boolean adicionaMusica(Musica musica) throws Exception{
		return album.adicionaMusica(musica);
	}
	
	
	
	
	
}
