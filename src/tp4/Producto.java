package tp4;

public class Producto {
	private Double precio;
	private int stock;
	
	public Producto(Double p, int s) {
		precio = p;
		stock = s;
	}

	public Double getPrecio() {
		return precio;
	}
}
