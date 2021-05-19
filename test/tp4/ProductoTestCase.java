package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTestCase {
	
	private Producto naranja;
	private ProductoDeCooperativa manzana;
	
	@BeforeEach
	public void setUp() throws Exception {
		naranja = new Producto(10d , 2);
		manzana = new  ProductoDeCooperativa(10d, 1);
	}
	
	@Test
	void testPrecios() {
		Double amount1 = naranja.montoAPagar();
		Double amount2 = manzana.montoAPagar();
		assertEquals(10d, amount1);
		assertEquals(9d, amount2);
		
	}
	
	@Test 
	void testBajaDeStock() {
		naranja.registrarVenta();;
		double amount = naranja.getStock();
		assertEquals(1, amount);
	}
	
	@Test 
	void testSubaDeStock() {
		naranja.subirStock(3);
		double amount = naranja.getStock();
		assertEquals(5, amount);
	}

}
