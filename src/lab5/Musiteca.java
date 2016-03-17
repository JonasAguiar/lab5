package lab5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Musiteca {
	
	private Musica musica;
	private Album album;
	private ArrayList<Album> albuns;
	private Playlist playlist;
	private Map<String, Playlist> playlists;
	
	public Musiteca(){
		this.musica = musica;
		this.album = album;
		this.albuns = new ArrayList<Album>();
		this.playlist = playlist;
		this.playlists = new HashMap<String, Playlist>();
	}

	
	
	
	
	
	
	
	
	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
	
}
