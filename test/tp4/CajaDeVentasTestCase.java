package tp4;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeVentasTestCase {

	private CajaDeVentas caja;
	private Producto naranja;
	private ProductoDeCooperativa manzana;
	private Impuesto impuesto;
	private Servicio servicio;
	
	@BeforeEach
	void setUp() throws Exception {
		caja = new CajaDeVentas();
		naranja = new Producto(10d, 2);
		manzana = new ProductoDeCooperativa(20d, 3);
		impuesto = new Impuesto(30d);
		servicio = new Servicio(2d, 20d);
		
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
	
	@Test
	void testRegistrarFacturas() {
		caja.registrarPago(impuesto);
		Double amount = caja.getMontoAPagar();
		assertEquals(30d, amount);
		caja.registrarPago(servicio);
		Double amount2 = caja.getMontoAPagar();
		assertEquals(70d, amount2);
	}
	
	@Test 
	void testRegistarFacturasYProductos() {
		caja.registrarFacturable(naranja);
		caja.registrarFacturable(impuesto);
		caja.registrarFacturable(servicio);
		caja.registrarFacturable(manzana);
		Double amount = caja.getMontoAPagar();
		assertEquals(98d, amount);
	}

}
