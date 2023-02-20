package junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos calcu = new NumerosAmigos (15,15);
		assertFalse(calcu.amigo());
	}
	
	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos calcu = new NumerosAmigos (0, 0);
		assertTrue(calcu.amigo());
	}

	@Test
	public void testEsCeroN1() {
		NumerosAmigos calcu = new NumerosAmigos (0, 10);
		assertNull(calcu.esN1IgualAN2());
	}
	
	@Test
	public void testN1yN2SonIguales() {
		int valorEsperado = 1;
		NumerosAmigos calcu = new NumerosAmigos (10, 10);
		int resultado = calcu.esN1IgualAN2();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void testN1yN2NoSonIguales() {
		int valorEsperado = 0;
		NumerosAmigos calcu = new NumerosAmigos (110, 10);
		int resultado = calcu.esN1IgualAN2();
		assertEquals(valorEsperado, resultado, 0);
	}

}
