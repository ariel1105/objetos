package tpObserver;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvestigadorTestCase {

	private Investigador investigador;
	private SistemaDePublicaciones sistema;
	private Articulo articulo;
	private ObserverInvestigador obs;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = mock(SistemaDePublicaciones.class);
		articulo = mock(Articulo.class);
		obs = mock(ObserverInvestigador.class);
		investigador = new Investigador(obs);
		
	}

	@Test
	void testRegistrarse() {
		investigador.registrarse(sistema);
		verify(sistema).registrar(investigador);
	}
	
	@Test
	void testPublicar() {
		investigador.publicar(articulo, sistema);
		verify(sistema).ingresar(articulo);
	}
	
	@Test
	void testSuscribirse() {
		investigador.suscribirseA("tema");
		verify(obs).agregarTemaDeInteres("tema");
	}
	

}
