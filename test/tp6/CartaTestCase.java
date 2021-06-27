package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTestCase {
	Carta carta1;
	Carta carta2;

	@BeforeEach
	void setUp() throws Exception {
		carta1 = new Carta ("3","C");
		carta2 = new Carta ("2","D");
	}

	@Test
	void testCartaAString() {
		String carta = carta1.aString();
		assertEquals("3C", carta);
	}
	
	
	@Test
	void test() {
		Boolean carta1ValeMasQueCarta2 = carta1.valeMasQue(carta2);
		assertTrue(carta1ValeMasQueCarta2);
	}

}
