package tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	private Banco banco;
	private Cliente cliente;
	private ArrayList<Cliente> clientes;
	private SolicitudCredito solicitud;
	private SectorPrestamos sector;
	
	@BeforeEach
	void setUp() throws Exception {
		sector = mock(SectorPrestamos.class);
		cliente = mock(Cliente.class);
		solicitud = mock(SolicitudCredito.class);
		banco = new Banco(sector);	
		clientes = new ArrayList<Cliente>();
	}

	@Test
	void testAgregarCliente() {
		clientes.add(cliente);
		banco.agregarCliente(cliente);
		ArrayList<Cliente> clientesDeBanco = banco.getClientes();
		assertEquals(clientes, clientesDeBanco);
	}
	
	@Test
	void testRegistrarSolicitudDeCredito() {
		banco.registrarSolicitud(solicitud);
		verify(sector).registrarSolicitud(solicitud);
		
	}

}
