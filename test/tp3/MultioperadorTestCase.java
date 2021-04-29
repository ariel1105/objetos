package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MultioperadorTestCase {
	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception{
		multioperador = new Multioperador();
		multioperador.agregar(2);
		multioperador.agregar(10);
		multioperador.agregar(5);
	}

	
	@Test
	public void testSumar() {
		int amount = multioperador.suma();
		assertEquals(17, amount);
	}
	
	@Test
	public void testRestar() {
		int amount = multioperador.resta();
		assertEquals(-13, amount);
	}
	
	@Test
	public void testMultiplicar() {
		int amount = multioperador.multiplicacion();
		assertEquals(100, amount);
	}

}
