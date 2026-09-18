package ar.edu.unju.fi.poo.pto2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RutaEnvio {
    private LocalDate fecha;
    private List<Envio> enviosAsociados;
    private List<Vehiculo> vehiculo;

    // Constructor que recibe LocalDate
    public RutaEnvio(LocalDate fecha) {
        this.fecha = fecha;
        this.enviosAsociados = new ArrayList<>();
        this.vehiculo = new ArrayList<>();
    }

    // Constructor que recibe String y Vehiculo (Corregido)
    public RutaEnvio(String fechaStr, Vehiculo vehiculo1) {
        this.fecha = LocalDate.parse(fechaStr);
        this.enviosAsociados = new ArrayList<>();
        this.vehiculo = new ArrayList<>();
        this.vehiculo.add(vehiculo1);
    }

    // Métodos del UML
    public void asignarRuta(Envio envio) {
        if (this.enviosAsociados == null) {
            this.enviosAsociados = new ArrayList<>();
        }
        this.enviosAsociados.add(envio);
        envio.setEstado(EstadoEnvio.EN_RUTA);
        System.out.println("Envío " + envio.getId() + " asignado a la ruta del " + fecha);
    }
    
    // Método extra para asignar el vehículo encargado de la ruta
    public void agregarVehiculo(Vehiculo v) {
        if (this.vehiculo == null) {
            this.vehiculo = new ArrayList<>();
        }
        this.vehiculo.add(v);
    }

    // Getters y Setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Envio> getEnviosAsociados() {
        return enviosAsociados;
    }

    public List<Vehiculo> getVehiculo() {
        return vehiculo;
    }
}