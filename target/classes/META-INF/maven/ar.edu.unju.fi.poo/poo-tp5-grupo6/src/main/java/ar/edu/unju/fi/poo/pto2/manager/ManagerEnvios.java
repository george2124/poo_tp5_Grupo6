package ar.edu.unju.fi.poo.pto2.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.pto2.model.Envio;
import ar.edu.unju.fi.poo.pto2.model.Vehiculo;

public class ManagerEnvios {

    private List<Envio> listaEnvios = new ArrayList<>();
    private List<Vehiculo> listaVehiculos = new ArrayList<>();
	


    // Agregar un envío a la lista
    public void agregarEnvio(Envio envio) {
        this.listaEnvios.add(envio);
    }

    // Agregar un vehículo a la lista
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.listaVehiculos.add(vehiculo);
    }
    
    
    // Buscar un vehículo por su patente
    public Vehiculo buscarVehiculo(String patente) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                return v;
            }
        }
        return null;
    }

    // Buscar un envío por su ID
    public Envio buscarEnvio(int id) {
        for (Envio e : listaEnvios) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    
    // Mostrar todos los envíos
    public void mostrarEnvios() {
        for (Envio e : listaEnvios) {
            System.out.println("ID: " + e.getId() + " | Estado Actual: " + e.getEstado());
        }
    }

    // Mostrar todos los vehículos
    public void mostrarVehiculos() {
        for (Vehiculo v : listaVehiculos) {
            System.out.println("Patente: " + v.getPatente() + " | Capacidad: " + v.getCapacidadPeso() + " kg");
        }
    }
}