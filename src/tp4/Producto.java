package tp4;

public class Producto implements Facturable {
	
	private Double precio;
	private int stock;
	
	public Producto(Double p, int s) {
		precio = p;
		stock = s;
	}

	public Double montoAPagar() {
		return precio;
	}

	public void registrarVenta() {
		stock --;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public void facturarseEn(MercadoCentral c) {
		c.registrarProducto(this);
	}

	public void subirStock(int i) {
		stock = stock + i;
	}
}
