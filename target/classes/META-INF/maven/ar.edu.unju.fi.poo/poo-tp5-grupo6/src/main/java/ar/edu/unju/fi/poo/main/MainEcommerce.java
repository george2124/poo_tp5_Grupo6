package ar.edu.unju.fi.poo.main;

import ar.edu.unju.fi.poo.manager.ManagerProducto;
import ar.edu.unju.fi.poo.model.CarritoDeCompras;
import ar.edu.unju.fi.poo.model.Producto;
import ar.edu.unju.fi.poo.model.Usuario;

public class MainEcommerce {
	
	public static void main(String[] args) {
		
		//Inicializamos nuestro catálogo de productos
		ManagerProducto catalogo = new ManagerProducto();
		
		//iv. Instanciar a un usuario con su correspondiente carrito de compras
		CarritoDeCompras miCarrito = new CarritoDeCompras(1);
		Usuario cliente = new Usuario("U-100", "Federico Singh", "fedesingh47@gmail.com", miCarrito);
		
		//v. Buscar productos y agregarlos al carrito
		Producto prod1 = catalogo.buscarProducto("P001"); //Notebook
		Producto prod2 = catalogo.buscarProducto("P002"); //Mouse
		Producto prod3 = catalogo.buscarProducto("P003"); //Monitor
		
		if (prod1 != null) cliente.agregarAlCarrito(prod1, 1);
		if (prod1 != null) cliente.agregarAlCarrito(prod2, 2); //Llevamos 2 mouses
		if (prod1 != null) cliente.agregarAlCarrito(prod3, 1);
		
		System.out.println("--- PRIMERA REVISIÓN ---");
		//vi. Mostrar el importe total
		cliente.verTotalCarrito();
		
		//vii. Mostrar el carrito
		cliente.mostrarCarrito();
		
		//viii. Buscar un producto y removerlo del carrito
		System.out.println("\n>> Me arrepentí, voy a quitar el Monitor (P004) del carrito...");
		Producto productoARemover = catalogo.buscarProducto("P004");
		if (productoARemover != null) {
			cliente.removerDelCarrito(productoARemover);
		}
		
		System.out.println("\n--- SEGUNDA REVISIÓN ---");
		//ix. Mostrar el importe total
		cliente.verTotalCarrito();
		cliente.mostrarCarrito(); //Lo mostramos de nuevo para confirmar que se borró el monitor
		
		//x. Vaciar el carrito
		System.out.println("\n>> Cancelando compra: Vaciando el carrito completo...");
		miCarrito.vaciar();
		
		//Mostramos el carrito por última vez para confirmar que quedó en 0
		cliente.mostrarCarrito();
	}
}
