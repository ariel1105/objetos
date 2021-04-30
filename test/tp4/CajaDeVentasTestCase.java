package tp4;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeVentasTestCase {

	private CajaDeVentas caja;
	private Producto naranja;
	private ProductoDeCooperativa manzana;
	
	@BeforeEach
	void setUp() throws Exception {
		caja = new CajaDeVentas();
		naranja = new Producto(10d, 2);
		manzana = new ProductoDeCooperativa(20d, 3);
		
	}

	@Test
	void testInicioDeVenta() {
		Double amount = caja.getMontoAPagar();
		assertEquals(0, amount);
	}
	
	@Test
	void testRegistrarProductos() {
		caja.registrarProducto(naranja);
		caja.registrarProducto(manzana);
		Double amount = caja.getMontoAPagar();
		assertEquals(28d, amount);
	}

}
