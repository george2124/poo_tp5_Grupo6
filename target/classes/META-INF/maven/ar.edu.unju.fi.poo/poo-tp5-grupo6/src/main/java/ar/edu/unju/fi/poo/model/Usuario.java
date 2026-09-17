package ar.edu.unju.fi.poo.model;

public class Usuario {
    private String id; 
    private String nombre; 
    private String email;
    private CarritoDeCompras carrito; 

    public Usuario(String id, String nombre, String email, CarritoDeCompras carrito) {
        this.setId(id);
        this.nombre = nombre;
        this.setEmail(email);
        this.carrito = carrito;
    }

    public void agregarAlCarrito(Producto p, int cantidad) { 
        if (this.carrito != null) {
            this.carrito.agregar(p, cantidad);
        }
    }

    public void removerDelCarrito(Producto p) { 
        if (this.carrito != null) {
            this.carrito.remover(p);
        }
    }

    public void verTotalCarrito() { 
        if (this.carrito != null) {
            System.out.println("Total del carrito de " + this.nombre + ": $" + this.carrito.total());
        }
    }

    public void mostrarCarrito() { 
        if (this.carrito != null && !this.carrito.getItems().isEmpty()) {
            System.out.println("\n--- CARRITO DE " + this.nombre.toUpperCase() + " ---");
            for (ItemCarrito item : this.carrito.getItems()) {
                System.out.println(item.getCantidad() + "x " + item.getProducto().getNombre() + 
                                   " | Subtotal: $" + item.subTotal());
            }
            System.out.println("TOTAL A PAGAR: $" + this.carrito.total());
        } else {
            System.out.println("El carrito está vacío.");
        }
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}