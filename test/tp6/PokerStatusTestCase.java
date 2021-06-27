package tp6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PokerStatusTestCase {
	
	private PokerStatus pokerStatus; //SUT
	//private IJugador jugador; // DOC
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;
	private ArrayList<Carta> mano1;
	private ArrayList<Carta> mano2;
	
	
	@BeforeEach
	void setUp() throws Exception {
	pokerStatus  = new PokerStatus();
	carta1 = mock(Carta.class);
	carta2 = mock(Carta.class);
	carta3 = mock(Carta.class);
	carta4 = mock(Carta.class);
	carta5 = mock(Carta.class);
	carta6 = mock(Carta.class);
	carta7 = mock(Carta.class);
	carta8 = mock(Carta.class);
	carta9 = mock(Carta.class);
	carta10 = mock(Carta.class);
	ArrayList <Carta> mano1 = new ArrayList<Carta>();
	mano1.add(carta1);
	mano1.add(carta2);
	mano1.add(carta3);
	mano1.add(carta4);
	mano1.add(carta5);
	ArrayList <Carta> mano2 = new ArrayList<Carta>();
	mano2.add(carta6);
	mano2.add(carta7);
	mano2.add(carta8);
	mano2.add(carta9);
	mano2.add(carta10);
	
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
		String palo = pokerStatus.paloDeCarta("AP");
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
		String[] manoArray = new String[]{"QC", "AC", "2C", "KD", "5T"};
		ArrayList <String> mano = new ArrayList<String> (Arrays.asList(manoArray));
		String valorCarta = "Q";
		int cantidadCartasDeValor = pokerStatus.cantidadDeCartasDeValor(valorCarta, mano);
		assertEquals(1, cantidadCartasDeValor);
	}
	
	@Test
	void testValorConMasOcurrenciasEnMano() {
		String[] manoArray = new String[]{"2C", "AC", "2T", "KD", "5T"};
		ArrayList <String> mano = new ArrayList<String> (Arrays.asList(manoArray));
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
		String[] manoArray = new String[]{"2C", "AC", "2T", "2D", "2P"};
		ArrayList <String> mano = new ArrayList<String> (Arrays.asList(manoArray));
		assertTrue(pokerStatus.esPoker(mano));
	}
	
	@Test 
	void cantidadDeCartasDePalo() {
		String[] manoArray = new String[]{"2C", "AC", "2T", "KC", "5T"};
		ArrayList <String> mano = new ArrayList<String> (Arrays.asList(manoArray));
		int cantidadDeCartasDeCorazones = pokerStatus.cantidadDeCartasDePalo("Corazones", mano);
		assertEquals(3, cantidadDeCartasDeCorazones);
	}
	
	@Test
	void testEsColor() {
		String[] manoArray = new String[]{"2C", "AC", "3C", "KC", "5C"};
		ArrayList <String> mano = new ArrayList<String> (Arrays.asList(manoArray));
		assertTrue(pokerStatus.esColor(mano));
	}
	
	@Test
	void testEsTrio() {
		String[] manoArray = new String[]{"2C", "3D", "2T", "KD", "2D"};
		ArrayList <String> mano = new ArrayList<String> (Arrays.asList(manoArray));
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
	
	@Test 
	void testVerificarConCartas() {
		when(carta1.aString()).thenReturn("AC");
		when(carta2.aString()).thenReturn("AT");
		when(carta3.aString()).thenReturn("3C");
		when(carta4.aString()).thenReturn("AD");
		when(carta5.aString()).thenReturn("AP");
		String poker = pokerStatus.verificarConCarta(carta1, carta2, carta3, carta4, carta5);
		assertEquals("Poker", poker);
	}
	
	@Test
	void testJugadaGanadora() {
		String poker = pokerStatus.jugadaGanadora("Poker", "Color");
		String color = pokerStatus.jugadaGanadora("Color", "Trio");
		String trio = pokerStatus.jugadaGanadora("Nada", "Trio");
		String sinGanador = pokerStatus.jugadaGanadora(color, color);
		assertEquals("Poker", poker);
		assertEquals("Color", color);
		assertEquals("Trio", trio);
		assertEquals("No hay Ganador", sinGanador);
	}
	
	/*@Test 
	void testPokerLeGanaAColor() {
		when(carta1.aString()).thenReturn("AC");
		when(carta2.aString()).thenReturn("AT");
		when(carta3.aString()).thenReturn("3C");
		when(carta4.aString()).thenReturn("AD");
		when(carta5.aString()).thenReturn("AP");
		when(carta6.aString()).thenReturn("7C");
		when(carta7.aString()).thenReturn("9C");
		when(carta8.aString()).thenReturn("JC");
		when(carta9.aString()).thenReturn("KC");
		when(carta10.aString()).thenReturn("QC");
		
		String manoGanadora = pokerStatus.manoGanadora(mano1, mano2);
	}
	*/
}
