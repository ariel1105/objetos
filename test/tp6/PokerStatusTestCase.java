package tp6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {
	
	private PokerStatus pokerStatus; //SUT
 	private IJugador jugador; // DOC
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
		jugador = mock(IJugador.class);
		
	}
	
	@Test
	void testValorDeCartaUnDigito() {
		String valor = pokerStatus.valorDeCarta("3D");
		assertEquals("3", valor);
	}
	
	@Test 
	void testValorDeCartaDosDigito() {
		String valor = pokerStatus.valorDeCarta("10P");
		assertEquals("10", valor);
	}
	
	
	@Test 
	void testPaloDeCartaDiamante() {
		String palo = pokerStatus.paloDeCarta("2D");
		assertEquals("Diamante", palo);
	}
	
	@Test 
	void testPaloDeCartaPica() {
		String palo = pokerStatus.paloDeCarta("1P");
		assertEquals("Pica", palo);
	}
	
	@Test 
	void testPaloDeCartaCorazones() {
		String palo = pokerStatus.paloDeCarta("10C");
		assertEquals("Corazones", palo);
	}
	
	@Test 
	void testPaloDeCartaTrebol() {
		String palo = pokerStatus.paloDeCarta("QT");
		assertEquals("Trebol", palo);
	}
	
	@Test
	void testCantidadDeCartasDeValor() {
		ArrayList<String> mano = new ArrayList<String>();
		mano.add("2P");
		mano.add("3C");
		mano.add("2T");
		mano.add("4C");
		mano.add("QC");
		String valorCarta = "Q";
		int cantidadCartasDeValor = pokerStatus.cantidadDeCartasDeValor(valorCarta, mano);
		assertEquals(1, cantidadCartasDeValor);
	}
	
	@Test
	void testValorConMasOcurrenciasEnMano() {
		ArrayList<String> mano = new ArrayList<String>();
		mano.add("2P");
		mano.add("3C");
		mano.add("2T");
		mano.add("4C");
		mano.add("QC");
		String valorConMasOcurrencias = pokerStatus.valorConMasOcurrencias(mano);
		assertEquals("2", valorConMasOcurrencias);
	}
	
	
	@Test
	void testEsPoker() {
		when(jugador.carta1()).thenReturn("3P");
		when(jugador.carta2()).thenReturn("3D");
		when(jugador.carta3()).thenReturn("3C");
		when(jugador.carta4()).thenReturn("3T");
		when(jugador.carta5()).thenReturn("1C");
		
		assertTrue(pokerStatus.verificar(jugador.carta1(), jugador.carta2(), jugador.carta3(), jugador.carta4(), jugador.carta5()));
	}
	

}
