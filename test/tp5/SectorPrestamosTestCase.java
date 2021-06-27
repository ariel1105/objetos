package tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SectorPrestamosTestCase {

	private SectorPrestamos sector;
	private SolicitudCredito solicitud;
	private ArrayList<SolicitudCredito> creditos;
	
	@BeforeEach
	void setUp() throws Exception {
		sector = new SectorPrestamos();
		solicitud = mock(SolicitudCredito.class);
		creditos = new ArrayList<SolicitudCredito>();
		creditos.add(solicitud);
	}

	@Test
	void testRegistrarSolicitud() {
		sector.registrarSolicitud(solicitud);
		ArrayList<SolicitudCredito> creditosDeSector = sector.getCreditos();
		assertEquals(creditos, creditosDeSector);
	}
	
	@Test
	void testEvaluarSolicitud() {
		when(solicitud.esAceptable()).thenReturn(true);
		sector.evaluarSolicitud(solicitud);
		ArrayList<SolicitudCredito>solicitudesAprobadas = sector.solicitudesAprobadas();
		assertEquals(creditos, solicitudesAprobadas);
	}
	
	@Test 
	void testMontoADesembolsar() {
		when(solicitud.esAceptable()).thenReturn(true);
		when(solicitud.getMontoSolicitado()).thenReturn(30000f);
		sector.registrarSolicitud(solicitud);
		sector.evaluarSolicitud(solicitud);
		float monto = sector.montoADesembolsar();
		assertEquals(30000f, monto);
	}

}
