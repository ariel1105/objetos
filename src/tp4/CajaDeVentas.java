package tp4;

import java.util.ArrayList;

public class CajaDeVentas implements Agencia{
	private Double montoAPagar;
	private ArrayList <Producto> productos = new ArrayList<Producto>();

	public CajaDeVentas() {
		this.iniciarVenta();
	}

	private void iniciarVenta() {
		montoAPagar = 0d;
	}

	public Double getMontoAPagar() {
		return montoAPagar;
	}

	public void registrarProducto(Producto p) {
		productos.add(p);
		montoAPagar = montoAPagar + p.getPrecio();
		p.registrarVenta();
	}

	public void registrarPago(Factura f) {
		montoAPagar = montoAPagar + f.montoAPagar();
		this.notificarAgencia();
	}

	private void notificarAgencia() {
		// TODO Auto-generated method stub
		
	}

	public void registrarFacturable(Facturable f) {
		f.facturarseEn(this);
	}
}

