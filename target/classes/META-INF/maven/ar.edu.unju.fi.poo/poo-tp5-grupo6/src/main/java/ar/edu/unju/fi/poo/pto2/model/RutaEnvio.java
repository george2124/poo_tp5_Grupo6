package ar.edu.unju.fi.poo.pto2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RutaEnvio {
	private LocalDate fecha;
	private List<Envio> enviosAsociados;
	private List<Vehiculo> vehiculo;
	//private Object enviosAsociados;
	
	
	public RutaEnvio(LocalDate fecha) {
		this.fecha = fecha;
		this.enviosAsociados = new ArrayList<>();
		this.vehiculo = new ArrayList<>();
	}
	
	  // Métodos del UML
    public void asignarRuta(Envio envio) {
        this.enviosAsociados.add(envio);
        envio.setEstado(EstadoEnvio.EN_RUTA);
        System.out.println("Envío " + envio.getId() + " asignado a la ruta del " + fecha);
    }
    
    // Método extra para asignar el vehículo encargado de la ruta
    public void agregarVehiculo(Vehiculo v) {
        this.vehiculo.add(v);
    }
    
    
}
