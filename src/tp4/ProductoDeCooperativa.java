package tp4;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(double d, int i) {
		super(d, i);
	}

	@Override 
	public Double montoAPagar() {
		return super.montoAPagar()*0.9;
	}
}
