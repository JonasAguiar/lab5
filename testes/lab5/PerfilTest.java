package lab5;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfilTest {

	@Test
	public void testPerfil() {
		try {
			Perfil jonas = new Perfil("Jonas");
			Perfil jonasAcustico = new Perfil("Jonas Acustico");
			Perfil jonasSoneca = new Perfil("Jonas Soneca");

			assertEquals("Jonas", jonas.getNome());
			assertEquals("Jonas Acustico", jonasAcustico.getNome());
			assertEquals("Jonas Soneca", jonasSoneca.getNome());

			
			Perfil alguem = new Perfil("Alguem");
			assertEquals(alguem, alguem);
			assertFalse(jonas.equals(alguem));

		} catch (Exception e) {
			fail();// nao deveria ter lancado nenhuma Exception nesse teste.
		}
	}
	
	@Test
	public void testPerfilInvalido() {
		try {
			Perfil jonas = new Perfil("");
			fail(); // se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			assertEquals("Nome do perfil nao pode ser nulo ou vazio",
					e.getMessage());
		}

		try {
			Perfil jonas = new Perfil(null);
			fail(); // se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			assertEquals("Nome do perfil nao pode ser nulo ou vazio",
					e.getMessage());
		}
	}
	
	@Test
	public void testEquals() {
		Perfil jonas;
		try {
			jonas = new Perfil("Jonas");
			Perfil jonasAcustico = new Perfil("Jonas Acustico");
			Perfil jonasSoneca = new Perfil("Jonas Soneca");

			assertEquals(jonas, new Perfil("Jonas"));
			assertNotEquals(jonas, jonasAcustico);
			assertNotEquals(jonasAcustico, jonasSoneca);
		} catch (Exception e) {
			fail("não deve lançar exceção aqui.");
		}
	}

}
