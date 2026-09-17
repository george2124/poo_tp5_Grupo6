package ar.edu.unju.fi.poo.model;

public class ItemCarrito {
	private int id;
	private Producto producto;
	private int cantidad;
	
	public ItemCarrito(int id, Producto producto, int cantidad) {
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public int getId() {
		return id;
	}
	
	public double subTotal() {
		return this.cantidad * this.producto.getPrecio();
	}
	
	public Producto getProducto() {
		return producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
}
