package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientesTest{ 
	
	private Cliente cliente;

	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Pedro", "Sanchez", 23, 1000f);
	}

	@Test
	void testSueldoNetoAnual() {
		Float amount = cliente.sueldoNetoAnual();
		assertEquals(12000f, amount);
	}

}
