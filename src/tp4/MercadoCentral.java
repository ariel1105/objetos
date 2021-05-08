package tp4;

import java.util.ArrayList;

public class MercadoCentral implements Agencia{
	private Double montoAPagar;
	private ArrayList <Producto> productos;

	public MercadoCentral() { 
		montoAPagar = 0d;
	}

	
	public Double getMontoAPagar() {
		return montoAPagar;
	}

	public void registrarProducto(Producto p) {
		if (p.getStock()> 0) {
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
}

