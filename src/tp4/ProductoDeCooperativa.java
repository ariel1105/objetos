package tp4;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(double d, int i) {
		super(d, i);
	}

	@Override 
	public Double getPrecio() {
		return super.getPrecio()*0.9;
	}
}
