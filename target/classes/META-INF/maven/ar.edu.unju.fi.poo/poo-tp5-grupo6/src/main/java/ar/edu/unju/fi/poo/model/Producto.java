package ar.edu.unju.fi.poo.model;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;
	private boolean activo;
	
	public Producto(String codigo, String nombre, double precio, boolean activo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.activo = activo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean isActivo() {
		return activo;
	}
}
