package lab5;

import static org.junit.Assert.*;

import org.junit.Test;


public class AlbumTest {

	@Test
	public void testAlbum() {
		try {
			Album thisIsActing = new Album("Sia","This Is Acting", 2016, true);
			Album weAreBorn = new Album("Sia","We Are Born", 2010, false);
			Album paradiseValley = new Album("John Mayer","Paradise Valley", 2013, true);
			
			assertEquals("Sia", thisIsActing.getArtista());
			assertEquals("This Is Acting", thisIsActing.getTitulo());
			assertEquals(2016, thisIsActing.getAnoDeLancamento());
			assertEquals(true, thisIsActing.isFavorito());

			
			assertEquals("Sia", weAreBorn.getArtista());
			assertEquals("We Are Born", weAreBorn.getTitulo());
			assertEquals(2010, weAreBorn.getAnoDeLancamento());
			assertEquals(false, weAreBorn.isFavorito());


			
			assertEquals("John Mayer", paradiseValley.getArtista());
			assertEquals("Paradise Valley", paradiseValley.getTitulo());
			assertEquals(2013, paradiseValley.getAnoDeLancamento());
			assertEquals(true, paradiseValley.isFavorito());


			Album paradiseValleyAcustic = new Album("John Mayer", "Paradise Valley Acustic", 2013, true);
			assertFalse(paradiseValley.equals(paradiseValleyAcustic));
			assertFalse(paradiseValley.equals(thisIsActing));

		} catch (Exception e) {
			fail();// nao deveria ter lancado nenhuma Exception nesse teste.
		}
	}

	@Test
	public void testEquals() {
		Album paradiseValley;
		try {
			paradiseValley = new Album("John Mayer", "Paradise Valley", 2013, true);
			Album thisIsActing = new Album("Sia","This Is Acting", 2016, true);
			Album weAreBorn = new Album("Sia","We Are Born", 2010, false);

			assertEquals(paradiseValley, new Album("John Mayer", "Paradise Valley", 2013, true));
			assertEquals(paradiseValley, new Album("John Mayer", "Paradise Valley", 2014, false));
			assertNotEquals(paradiseValley, thisIsActing);
			assertNotEquals(weAreBorn, thisIsActing);
		} catch (Exception e) {
			fail("não deve lançar exceção aqui.");
		}
	}

	@Test
	public void testAlbumInvalida() {
		try {
			Album artistaInvalido = new Album("","Paradise Valley", 2013, true);
			fail(); // se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			assertEquals("Artista do album nao pode ser nulo ou vazio.",
					e.getMessage());
		}

		try {
			Album artistaInvalido = new Album(null,"Paradise Valley", 2013, true);
			fail(); // se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			assertEquals("Artista do album nao pode ser nulo ou vazio.",
					e.getMessage());
		}

		try {
			Album tituloInvalido = new Album("John Mayer","", 2013, true);
			fail(); // se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			assertEquals("Titulo do album nao pode ser nulo ou vazio.",
					e.getMessage());
		}

		try {
			Album tituloInvalido = new Album("John Mayer", null, 2013, true);
			fail(); // se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			assertEquals("Titulo do album nao pode ser nulo ou vazio.",
					e.getMessage());
		}

		try {
			Album anoDeLancamentoInvalido = new Album("John Mayer", "Paradise Valley", 1899, true);
			fail(); // se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			assertEquals("Ano de lancamento nao pode ser menor que 1900",
					e.getMessage());
		}

		try {
			Album anoDeLancamentoInvalido = new Album("John Mayer", "Paradise Valley", -1, true);
			fail(); // se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			assertEquals("Ano de lancamento nao pode ser menor que 1900",
					e.getMessage());
		}
		
	}
	
	@Test
	public void testGetMusicaIndice() {
		try {
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			album.adicionaMusica(musica);
			album.getMusicaPorIndice(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetMusicaNome(){
		Album album;
		try {
			album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			album.adicionaMusica(musica);
			album.getMusicaPorNome("Happy");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetDuracaoAlbum(){
		try {
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			Musica musica1 = new Musica("Gravity", 3, "pop");
			Musica musica2 = new Musica("Daughters", 3, "pop");
			album.adicionaMusica(musica);
			album.adicionaMusica(musica1);
			album.adicionaMusica(musica2);
			assertEquals(album.getDuracaoAlbum(), 9);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAdicionaMusica(){
		try {
			Album album = new Album("John Mayer", "Paradise Valley", 2013, true);
			Musica musica = new Musica("Happy", 3, "pop");
			album.adicionaMusica(musica);
			assertTrue(album.adicionaMusica(musica));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}