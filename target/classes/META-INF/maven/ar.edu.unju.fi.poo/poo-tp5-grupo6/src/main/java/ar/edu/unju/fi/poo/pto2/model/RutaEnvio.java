package ar.edu.unju.fi.poo.pto2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RutaEnvio {
    private LocalDate fecha;
    private Vehiculo vehiculo;
    private List<Envio> envioAsociado;
    
    // Constructor 
    public RutaEnvio(LocalDate fecha, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.envioAsociado = new ArrayList<>();   
    }

    // Constructor que recibe String 
    public RutaEnvio(String fechaStr, Vehiculo vehiculo) {
        this.fecha = LocalDate.parse(fechaStr);
        this.vehiculo = vehiculo;
        this.envioAsociado = new ArrayList<>();
    }

    // Métodos 
    public boolean asignarRuta(Envio envio) {
        if (envio.getEnvio().isEmpty()) {
        	 System.out.println("No se puede asignar una ruta a un envío sin paquetes.");
             return false;
        }
        
        // Validamos el peso sumando el nuevo envío usando nuestra función de control
        double pesoActual = 0;
        for (Envio e : envioAsociado) {
            pesoActual += e.obtenerPesoTotalEnvio();
        }
        if (pesoActual + envio.obtenerPesoTotalEnvio() <= vehiculo.getCapacidadPeso()) {
            envioAsociado.add(envio);
            envio.setEstado(EstadoEnvio.EN_ALMACEN);
            return true;
        }
        return false;
    }
    
    // calcularPesoTotal(): boolean
    // Retorna true si la carga acumulada actual es segura y no supera el máximo del vehículo
    public boolean calcularPesoTotal() {
        double pesoAcumulado = 0;
        for (Envio e : envioAsociado) {
            pesoAcumulado += e.obtenerPesoTotalEnvio();
        }
        return pesoAcumulado <= vehiculo.getCapacidadPeso();
    }

    // Getters y Setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Envio> getEnviosAsociados() {
        return getEnviosAsociados();
    }

}