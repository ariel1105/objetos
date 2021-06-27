package tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudCreditoPersonalTestCaseTest {

	private SolicitudCreditoPersonal solicitud;
	private Cliente solicitante;
	
	@BeforeEach
	void setUp() throws Exception {
		solicitante = mock(Cliente.class);
		solicitud = new SolicitudCreditoPersonal(12000, 12, solicitante);
	}

	@Test
	void testSolicitanteTieneIngresosAnualesSuficientes() {
		when(solicitante.sueldoNetoAnual()).thenReturn(16000f);
		boolean sonIngresosSuficientes = solicitud.solicitanteTieneIngresosAnualesSuficientes();
		assertTrue(sonIngresosSuficientes);
	}
	
	@Test
	void testSolicitantetieneIngresosMensualesSuficientes() {
		when(solicitante.getSueldoNetoMensual()).thenReturn(1500f);
		boolean sonIngresosSuficientes = solicitud.solicitanteTieneMensualesSuficientes();
		assertTrue(sonIngresosSuficientes);
	}

	@Test
	void testEsAceptable() {
		when(solicitante.sueldoNetoAnual()).thenReturn(16000f);
		when(solicitante.getSueldoNetoMensual()).thenReturn(1500f);
		boolean esAceptable = solicitud.esAceptable();
		assertTrue(esAceptable);
	}
}
