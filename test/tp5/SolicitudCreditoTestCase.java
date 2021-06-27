package tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudCreditoTestCase {
	
	private SolicitudCredito solicitud;
	private Cliente solicitante;

	@BeforeEach
	void setUp() throws Exception {
		solicitud = spy(SolicitudCredito.class);
		solicitud.setMontoYPlazo(1200, 12, solicitante);
	}

	@Test
	void testMontoCuotaMensual() {
		float monto = solicitud.montoCuotaMensual();
		assertEquals(100f, monto);
	}

}
