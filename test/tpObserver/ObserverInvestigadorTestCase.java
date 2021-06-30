package tpObserver;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Observable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObserverInvestigadorTestCase {
	
	private ObserverInvestigador obs;
	private Investigador investigador;
	private Observable observable;
	private Articulo articulo;

	@BeforeEach
	void setUp() throws Exception {
		observable = mock(Observable.class);
		articulo = mock(Articulo.class);
		obs = new ObserverInvestigador();
		investigador = mock(Investigador.class);
		obs.setInvestigador(investigador);
	}

	@Test
	void testAgregarTemaDeInteres() {
		obs.agregarTemaDeInteres("tema");
		boolean tieneTema = obs.estaInteresado("tema");
		assertTrue(tieneTema);

	}
	@Test
	void testEsArticuloDeInteres() {
		ArrayList<String> temas = new ArrayList<String>();
		temas.add("tema");
		when(articulo.temasDeInteres()).thenReturn(temas);
		obs.agregarTemaDeInteres("tema");
		boolean esTemaDeInteres = obs.tieneTemasDeInteres(articulo);
		assertTrue(esTemaDeInteres);
	}
	
	@Test
	void testUpdate() {
		ArrayList<String> temas = new ArrayList<String>();
		temas.add("tema");
		when(articulo.temasDeInteres()).thenReturn(temas);
		obs.agregarTemaDeInteres("tema");
		obs.update(observable, articulo);
		verify(investigador).recibirNotificacion(articulo);
	}
	

}
