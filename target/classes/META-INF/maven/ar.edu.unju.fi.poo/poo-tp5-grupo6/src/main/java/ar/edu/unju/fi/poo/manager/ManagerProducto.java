package ar.edu.unju.fi.poo.manager;


import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.model.Producto;

public class ManagerProducto {
	private List<Producto> productos;
	
	public ManagerProducto() {
		this.productos = new ArrayList<>();
		inicializarProductos();
	}
	
	//ii. Gestionar lista e inicializar con 5 más productos
	private void inicializarProductos() {
		productos.add(new Producto("P001", "Notebook HP 15", 850000.0, true));
		productos.add(new Producto("P002", "Mouse Logitech Inalámbrico", 25000.0, true));
		productos.add(new Producto("P003", "Teclado Mecánico Redragon", 55000.0, true));
		productos.add(new Producto("P004", "Monitor Samsung 24\"", 180000.0, true));
		productos.add(new Producto("P005", "Auriculares hyperX", 90000.0, true));
		productos.add(new Producto("P006", "Pad Mouse (Sin Stock)", 10000.0, false));
	}
	
	//Método para poder buscar los productos desde el Main
	public Producto buscarProducto(String codigo) {
		for (Producto p : productos) {
			if (p.getCodigo().equals(codigo)) {
				return p;
			}
		}
		return null; //Retorna nulo si el codigo no existe
	}
}
