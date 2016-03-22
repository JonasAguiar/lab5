package lab5;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MusitecaTest {

	@Test
	public void testObtemMusicaPorIndice() {
		try {
			Musiteca musiteca = new Musiteca();
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			album.adicionaMusica(musica);
			musiteca.adicionaAlbum(album);
			musiteca.obtemMusicaPorIndice("Happy", 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAdicionaAlbum() {
		try {
			Musiteca musiteca = new Musiteca();
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			musiteca.adicionaAlbum(album);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRemoveAlbum() {
		try {
			Musiteca musiteca = new Musiteca();
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			musiteca.adicionaAlbum(album);
			musiteca.removeAlbum(album);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetAlbumPorNome() {
		try {
			Musiteca musiteca = new Musiteca();
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			musiteca.adicionaAlbum(album);
			musiteca.getAlbumPorNome("Paradise Valley");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAdicionaPlaylist() {
		try {
			Musiteca musiteca = new Musiteca();
			Playlist playlist = new Playlist("Animacao");
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			Musica musica2 = new Musica("Sad", 3, "pop");
			album.adicionaMusica(musica);
			album.adicionaMusica(musica2);
			musiteca.adicionaPlaylist("Animacao", album.getTitulo(), 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetPlaylist() {
		try {
			Musiteca musiteca = new Musiteca();
			Playlist playlist = new Playlist("Animacao");
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			Musica musica2 = new Musica("Sad", 3, "pop");
			album.adicionaMusica(musica);
			album.adicionaMusica(musica2);
			musiteca.adicionaPlaylist("Animacao", album.getTitulo(), 1);
			musiteca.getPlaylist("Animacao");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRemovePlaylist() {
		try {
			Musiteca musiteca = new Musiteca();
			Playlist playlist = new Playlist("Animacao");
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			Musica musica2 = new Musica("Sad", 3, "pop");
			album.adicionaMusica(musica);
			album.adicionaMusica(musica2);
			musiteca.adicionaPlaylist("Animacao", album.getTitulo(), 1);
			musiteca.removePlaylist("Animacao");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testPesquisaPlaylist() {
		try {
			Musiteca musiteca = new Musiteca();
			Playlist playlist = new Playlist("Animacao");
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			Musica musica2 = new Musica("Sad", 3, "pop");
			album.adicionaMusica(musica);
			album.adicionaMusica(musica2);
			musiteca.adicionaPlaylist("Animacao", album.getTitulo(), 1);
			musiteca.pesquisaPlaylist("Animacao");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testAdicionaFavorito() {
		try {
			Musiteca musiteca = new Musiteca();
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			musiteca.adicionaAlbum(album);
			musiteca.adicionaFavorito("Paradise Valley");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRemoveFavorito() {
		try {
			Musiteca musiteca = new Musiteca();
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			musiteca.adicionaAlbum(album);
			musiteca.adicionaFavorito("Paradise Valley");
			musiteca.removeFavorito("Paradise Valley");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPesquisaFavoritoPorNome() {
		try {
			Musiteca musiteca = new Musiteca();
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			musiteca.adicionaAlbum(album);
			musiteca.adicionaFavorito("Paradise Valley");
			musiteca.pesquisaFavoritoPorNome("Paradise Valley");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPesquisaFavoritoPorObjeto() {
		try {
			Musiteca musiteca = new Musiteca();
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			musiteca.adicionaAlbum(album);
			musiteca.adicionaFavorito("Paradise Valley");
			musiteca.pesquisaFavoritoPorObjeto(album);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDuracaoPlaylist() {
		try {
			Musiteca musiteca = new Musiteca();
			Playlist playlist = new Playlist("Animacao");
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			Musica musica2 = new Musica("Sad", 3, "pop");
			album.adicionaMusica(musica);
			album.adicionaMusica(musica2);
			musiteca.adicionaPlaylist("Animacao", album.getTitulo(), 1);
			musiteca.getDuracaoPlaylist("Animacao");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
}

