package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTestCase {
	
	private Producto naranja;
	private ProductoDeCooperativa manzana;
	private CajaDeVentas caja;

	@BeforeEach
	public void setUp() throws Exception {
		naranja = new Producto(10d , 2);
		manzana = new  ProductoDeCooperativa(10d, 1);
		caja = new CajaDeVentas();
	}
	
	@Test
	void testPrecios() {
		Double amount1 = naranja.getPrecio();
		Double amount2 = manzana.getPrecio();
		assertEquals(10d, amount1);
		assertEquals(9d, amount2);
		
	}
	
	@Test 
	void testBajaDeStock() {
		caja.registrarProducto(naranja);
		double amount = naranja.getStock();
		assertEquals(1, amount);
	}

}
