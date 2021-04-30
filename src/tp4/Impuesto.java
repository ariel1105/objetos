package tp4;

public class Impuesto implements Factura, Facturable{
	
	private Double tasa;
	
	public Impuesto(Double t) {
		tasa = t;
	}

	public Double montoAPagar() {
		return tasa;
	}

	@Override
	public void facturarseEn(CajaDeVentas c) {
		c.registrarPago(this);
		
	}
}
