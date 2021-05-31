package tp6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {
	
	private PokerStatus pokerStatus; //SUT
	//private IJugador jugador; // DOC
	
	@BeforeEach
	void setUp() throws Exception {
	pokerStatus  = new PokerStatus();
	//jugador = mock(IJugador.class);
		
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
		String[] mano = new String[]{"QC", "1C", "2C", "KD", "5T"};
		String valorCarta = "Q";
		int cantidadCartasDeValor = pokerStatus.cantidadDeCartasDeValor(valorCarta, mano);
		assertEquals(1, cantidadCartasDeValor);
	}
	
	@Test
	void testValorConMasOcurrenciasEnMano() {
		String[] mano = new String[]{"2C", "1C", "2T", "KD", "5T"};
		String valorConMasOcurrencias = pokerStatus.valorConMasOcurrencias(mano);
		assertEquals("2", valorConMasOcurrencias);
	}
	
	
	@Test
	void testEsPoker() {
		/*when(jugador.carta1()).thenReturn("3P");
		when(jugador.carta2()).thenReturn("3D");
		when(jugador.carta3()).thenReturn("3C");
		when(jugador.carta4()).thenReturn("3T");
		when(jugador.carta5()).thenReturn("1C");
		*/
		String[] mano = new String[]{"2C", "1C", "2T", "2D", "2P"};
		
		assertTrue(pokerStatus.esPoker(mano));
	}
	
	@Test 
	void cantidadDeCartasDePalo() {
		String[] mano = new String[]{"2C", "1C", "2T", "KC", "5T"};
		int cantidadDeCartasDeCorazones = pokerStatus.cantidadDeCartasDePalo("Corazones", mano);
		assertEquals(3, cantidadDeCartasDeCorazones);
	}
	
	@Test
	void testEsColor() {
		String[] mano = new String[]{"2C", "1C", "3C", "KC", "5C"};
		assertTrue(pokerStatus.esColor(mano));
	}
	
	@Test
	void testEsTrio() {
		String[] mano = new String[]{"2C", "3D", "2T", "KD", "2D"};
		assertTrue(pokerStatus.esTrio(mano));
	}
	
	@Test
	void testVerificar() {
		String poker = pokerStatus.verificar("AC","AT","3C","AD","AP");
		String trio = pokerStatus.verificar("3C", "QC", "3D", "3T", "KC");
		String color = pokerStatus.verificar("AT", "KT", "QT", "3T", "4T");
		String nada = pokerStatus.verificar("3C", "2T", "AC", "7C", "5T");
		assertEquals("Poker", poker);
		assertEquals("Trio", trio);
		assertEquals("Color", color);
		assertEquals("Nada", nada);
	}
	
}
