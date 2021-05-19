package tp4;

import java.util.ArrayList;

public class MercadoCentral implements Agencia{
	private Double montoAPagar;
	private ArrayList <Producto> productos = new ArrayList<Producto>();

	public MercadoCentral() { 
		montoAPagar = 0d;
	}

	
	public Double getMontoAPagar() {
		return montoAPagar;
	}

	public void registrarProducto(Producto p) {
		if (p.getStock()> 0 && this.tieneProducto(p)) {
			this.sumarDineroDeVenta(p.montoAPagar());
			p.registrarVenta();	
		}	
	}

	private void sumarDineroDeVenta(Double p) {
		montoAPagar = montoAPagar + p;
	}
	
	
	public void registrarPago(Factura f) {
		this.sumarDineroDeVenta(f.montoAPagar());  
		this.notificarAgencia();					 
	}												 

	private void notificarAgencia() {
		// TODO Auto-generated method stub
		
	}

	public void registrarFacturable(Facturable f) {
		f.facturarseEn(this);
	}


	public Boolean tieneProducto(Producto p) {
		return productos.contains(p);
	}


	public void agregarProducto(Producto p) {
		productos.add(p);		
	}


	public int stockDeProducto(Producto p) {
		return p.getStock();
	}


	public void subirStock(Producto p, int i) {
		p.subirStock(i);
	}
}

