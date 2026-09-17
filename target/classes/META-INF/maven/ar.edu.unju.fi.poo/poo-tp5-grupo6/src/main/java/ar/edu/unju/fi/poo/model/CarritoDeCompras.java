package ar.edu.unju.fi.poo.model;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private int id;
    private List<ItemCarrito> items; 
    private int contadorIdItems = 1;

    public CarritoDeCompras(int id) {
        this.setId(id);
        this.items = new ArrayList<>(); // Inicializamos la lista vacía
    }

    public void agregar(Producto p, int cantidad) {
        if (p.isActivo()) {
            // Composición: El carrito crea el Item internamente
            ItemCarrito nuevoItem = new ItemCarrito(contadorIdItems++, p, cantidad);
            this.items.add(nuevoItem);
        } else {
            System.out.println("El producto " + p.getNombre() + " no está activo.");
        }
    }

    public void remover(Producto p) { 
        // Usamos removeIf para buscar y eliminar el ítem que contenga este producto
        this.items.removeIf(item -> item.getProducto().equals(p));
    }

    public double total() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public void vaciar() { 
        this.items.clear();
    }
    
    public List<ItemCarrito> getItems() {
        return items;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}