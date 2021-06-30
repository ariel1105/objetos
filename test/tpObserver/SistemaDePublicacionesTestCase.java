package tpObserver;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaDePublicacionesTestCase {
	
	private SistemaDePublicaciones sistema;
	private Investigador investigador;
	private Articulo articulo;
	private ObserverInvestigador obs;

	@BeforeEach
	void setUp() throws Exception {
		sistema = new SistemaDePublicaciones();
		investigador = mock(Investigador.class);
		articulo = mock(Articulo.class);
	}

	@Test
	void testNotificar() {
		sistema.addObserver(obs);
		sistema.ingresar(articulo);
	}

}
