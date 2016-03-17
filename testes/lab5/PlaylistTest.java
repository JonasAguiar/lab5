package lab5;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlaylistTest {
	/*
	@Test
	public void testPlaylist() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testAdicionaMusica() {
		try {
			Playlist playlist = new Playlist("Play1");
			Musica musica = new Musica("Chandelier", 3, "Pop");
			assertTrue(playlist.adicionaMusica(musica));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPesquisaMusica() {
		try {
			Playlist playlist = new Playlist("Play1");
			Musica musica = new Musica("Chandelier", 3, "Pop");
			playlist.adicionaMusica(musica);
			assertTrue(playlist.pesquisaMusica("Chandelier"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRemoveMusicaPorNome() {
		try {
			Playlist playlist = new Playlist("Play1");
			Musica musica = new Musica("Chandelier", 3, "Pop");
			playlist.adicionaMusica(musica);
			assertTrue(playlist.removeMusicaPorNome("Chandelier"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRemoveMusicaPorObjeto() {
		try {
			Playlist playlist = new Playlist("Play1");
			Musica musica = new Musica("Chandelier", 3, "Pop");
			playlist.adicionaMusica(musica);
			assertTrue(playlist.removeMusicaPorObjeto(musica));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetDuracaoPlayList() {
		try {
			Playlist playlist = new Playlist("Play1");
			Musica musica = new Musica("Chandelier", 3, "Pop");
			Musica musica1 = new Musica("Chandelier2", 3, "Pop");
			playlist.adicionaMusica(musica);
			playlist.adicionaMusica(musica1);
			assertEquals(6, playlist.getDuracaoPlayList());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}*/

}

