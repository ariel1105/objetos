package tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudCreditoHipotecarioTestCase {
	
	private SolicitudCreditoHipotecario solicitud;
	private Cliente solicitante;
	private Propiedad garantia;

	@BeforeEach
	void setUp() throws Exception {
		solicitante = mock(Cliente.class);
		garantia = mock(Propiedad.class);
		solicitud = new SolicitudCreditoHipotecario(12000f, 12, solicitante, garantia);
	}

	@Test
	void testAniosDeDuracionDeCredito() {
		int anios = solicitud.duracionEnAnios();
		assertEquals(1, anios);
	}
	
	@Test
	void testSolicitanteTieneEdadAcorde() {
		when(solicitante.getEdad()).thenReturn(25);
		boolean tieneEdadAcorde = solicitud.solicitanteTieneEdadAcorde();
		assertTrue(tieneEdadAcorde);
	}
	
	@Test
	void testSolicitanteTieneIngresosMensualesSuficientes() {
		when(solicitante.getSueldoNetoMensual()).thenReturn(10000f);
		boolean tieneIngresosSuficientes = solicitud.tieneIngresosMensualesSuficientes();
		assertTrue(tieneIngresosSuficientes);
	}
	
	@Test
	void testValorDeGarantiaSuficiente() {
		when(garantia.getValorFiscal()).thenReturn(10000f);
		boolean valorDeGarantiaSuficiente = solicitud.valorDeGarantiaSuficiente();
		assertTrue(valorDeGarantiaSuficiente);
	}
	
	@Test
	void testEsAceptable() {
		when(solicitante.getEdad()).thenReturn(25);
		when(solicitante.getSueldoNetoMensual()).thenReturn(10000f);
		when(garantia.getValorFiscal()).thenReturn(10000f);
		boolean esAceptable = solicitud.esAceptable();
		assertTrue(esAceptable);
	}

}
