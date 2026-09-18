package ar.edu.unju.fi.poo.pto2.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.pto2.model.Envio;
import ar.edu.unju.fi.poo.pto2.model.Vehiculo;

public class ManagerEnvios {

    private List<Envio> envios;
    private List<Vehiculo> vehiculos;

    public ManagerEnvios() {
        this.envios = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    // Agregar un envío a la lista
    public void agregarEnvio(Envio envio) {
        envios.add(envio);
    }

    // Agregar un vehículo a la lista
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Buscar un envío por su ID
    public Envio buscarEnvio(int id) {
        for (Envio e : envios) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    // Buscar un vehículo por su patente
    public Vehiculo buscarVehiculo(String patente) {
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equals(patente)) {
                return v;
            }
        }
        return null;
    }

    // Mostrar todos los envíos
    public void mostrarEnvios() {
        for (Envio e : envios) {
            System.out.println(e);
        }
    }

    // Mostrar todos los vehículos
    public void mostrarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }
}