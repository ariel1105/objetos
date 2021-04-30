package tp4;


public class CajaDeVentas implements Agencia{
	private Double montoAPagar;

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
		sumarDineroDeVenta(p);
		p.registrarVenta();
	}

	private void sumarDineroDeVenta(Facturable p) {
		montoAPagar = montoAPagar + p.montoAPagar();
	}
	
	

	public void registrarPago(Factura f) {
		montoAPagar = montoAPagar + f.montoAPagar(); // busque refactorear para usar 
		this.notificarAgencia();					 // dinero de venta pero por el enunciado
	}												 // caja debe implementar registrarPago(Factura f)

	private void notificarAgencia() {
		// TODO Auto-generated method stub
		
	}

	public void registrarFacturable(Facturable f) {
		f.facturarseEn(this);
	}
}

