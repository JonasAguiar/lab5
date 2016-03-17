package lab5;

import java.util.ArrayList;

public class Musiteca {
	
	private Musica musica;
	private Album album;
	private ArrayList<Album> albuns;
	private Playlist playlist;
	private ArrayList<Playlist> playlists;
	
	public Musiteca(){
		this.musica = musica;
		this.album = album;
		this.albuns = new ArrayList<Album>();
		this.playlist = playlist;
		this.playlists = new ArrayList<Playlist>();
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
