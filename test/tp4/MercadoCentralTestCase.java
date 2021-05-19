package tp4;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoCentralTestCase {

	private MercadoCentral mercado;
	private Producto naranja;
	private ProductoDeCooperativa manzana;
	private Impuesto impuesto;
	private Servicio servicio;
	
	@BeforeEach
	void setUp() throws Exception {
		mercado = new MercadoCentral();
		naranja = new Producto(10d, 2);
		manzana = new ProductoDeCooperativa(20d, 3);
		impuesto = new Impuesto(30d);
		servicio = new Servicio(2d, 20d);
		
	}

	@Test
	void testInicioDeVenta() {
		Double amount = mercado.getMontoAPagar();
		assertEquals(0, amount);
	}
	
	@Test
	void testMercadoNoTieneProducto() {
		assertFalse(mercado.tieneProducto(naranja));
	}
	
	@Test
	void testAgregarProductoAlMercado() {
		mercado.agregarProducto(naranja);
		assertTrue(mercado.tieneProducto(naranja));
	}
	
	@Test
	void testProductoNoSeRegistraSiNoExisteEnElMercado() {
		mercado.registrarProducto(naranja);
		Double amount = mercado.getMontoAPagar();
		assertEquals(0, amount);
	}
	
	@Test 
	void testRegistrarProductoAgregado() {
		mercado.agregarProducto(naranja);
		mercado.registrarProducto(naranja);
		Double amount = mercado.getMontoAPagar();
		assertEquals(10d, amount);	
	}
	
	@Test 
	void testStockDeProductoEnMercado() {
		mercado.agregarProducto(naranja);
		int amount = mercado.stockDeProducto(naranja);
		assertEquals(2, amount);
	}
	
	@Test
	void testSubirStockDeProducto() {
		mercado.agregarProducto(naranja);
		mercado.subirStock(naranja, 5);
		int amount = mercado.stockDeProducto(naranja);
		assertEquals(7, amount);
	}
	
	@Test
	void testRegistrarFacturas() {
		mercado.registrarPago(impuesto);
		Double amount = mercado.getMontoAPagar();
		assertEquals(30d, amount);
		mercado.registrarPago(servicio);
		Double amount2 = mercado.getMontoAPagar();
		assertEquals(70d, amount2);
	}
	
	@Test 
	void testRegistarFacturasYProductos() {
		mercado.agregarProducto(manzana);
		mercado.agregarProducto(naranja);
		mercado.registrarFacturable(naranja);
		mercado.registrarFacturable(impuesto);
		mercado.registrarFacturable(servicio);
		mercado.registrarFacturable(manzana);
		Double amount = mercado.getMontoAPagar();
		assertEquals(98d, amount);
	}

}
