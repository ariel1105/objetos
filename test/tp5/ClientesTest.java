package tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientesTest{ 
	
	private Cliente cliente;
	private Banco banco;
	private SolicitudCredito solicitud;

	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Pedro", "Sanchez", 23, 1000f);
		banco = mock(Banco.class);
		solicitud = mock(SolicitudCredito.class);
	}

	@Test
	void testSueldoNetoAnual() {
		Float amount = cliente.sueldoNetoAnual();
		assertEquals(12000f, amount);
	}
	
	@Test
	void testSolicitarCredito() {
		cliente.solicitarCredito(banco, solicitud);
		verify(banco).registrarSolicitud(solicitud);
	}
	

}
