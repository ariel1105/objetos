package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	 
	private Point punto1;
	private Point punto2;
	
	@BeforeEach
	void setUp() throws Exception{
		punto1 = new Point();
		punto2 = new Point(1,2);
	}
	
	@Test
	void testConstructorConParametros() {
		int x = punto2.getX();
		int y = punto2.getY();
		assertEquals(1,x);
		assertEquals(2,y);
	}

	@Test
	void testConstructorSinParametros() {
		int x = punto1.getX();
		int y = punto1.getY();
		assertEquals(0, x);
		assertEquals(0, y);	
	}
	
	@Test
	void testMoverPunto() {
		punto1.setXY(3,5);
		int x = punto1.getX();
		int y = punto1.getY();
		assertEquals(3, x);
		assertEquals(5, y);	
	}
	
	@Test
	void testSumarPuntos() {
		Point punto3 = punto1.sumarCon(punto2);
		int x = punto3.getX();
		int y = punto3.getY();
		assertEquals(1, x);
		assertEquals(2, y);
	}
}	
