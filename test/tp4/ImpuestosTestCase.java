package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestosTestCase {
	
	private Servicio servicio;
	private Impuesto impuesto;

	@BeforeEach
	void setUp() throws Exception {
		servicio = new Servicio(3d, 30d);
		impuesto = new Impuesto(60d);
	}

	@Test
	void testMontosDeFacturas() {
		Double amount1 = servicio.montoAPagar();
		Double amount2 = impuesto.montoAPagar();
		assertEquals(90d, amount1);
		assertEquals(60d, amount2);
	}

}
