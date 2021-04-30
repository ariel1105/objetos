package tp4;

public class Servicio implements Factura, Facturable {
	
	private Double cantUnidades;
	private Double costoPorUnidad;
	
	public Servicio(Double a, Double b) {
		cantUnidades = a;
		costoPorUnidad = b;
	}

	public Double montoAPagar() {
		return cantUnidades * costoPorUnidad;
	}

	@Override
	public void facturarseEn(CajaDeVentas c) {
		c.registrarPago(this);
	}

}
