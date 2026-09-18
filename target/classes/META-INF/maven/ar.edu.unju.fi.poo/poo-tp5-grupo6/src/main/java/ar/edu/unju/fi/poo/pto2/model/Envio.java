package ar.edu.unju.fi.poo.pto2.model;

import java.util.ArrayList;
import java.util.List;

public class Envio {
	private int id;
	private String remitente;
	private String destinatario;
	private String direccionEntrega;
	private EstadoEnvio estado;
	private List<Paquete> envio;
	
	
	public Envio(int id, String remitente, String destinatario, String direccionEntrega, EstadoEnvio estado) {
		super();
		this.id = id;
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.direccionEntrega = direccionEntrega;
		this.estado = EstadoEnvio.GENERADO;
		this.envio = new ArrayList<>();
	}
	
	

    public void agregarPaquete(Paquete paquete) {
        this.envio.add(paquete);
    }

    public void despachar() {
        this.estado = EstadoEnvio.EN_RUTA;
        System.out.println("El envío " + id + " ha sido despachado y está en ruta.");
    }

    public void devolver() {
        this.estado = EstadoEnvio.DEVUELTO;
        System.out.println("El envío " + id + " ha sido devuelto.");
    }

    public void mostrarInfo() {
        System.out.println("Envío ID: " + id);
        System.out.println("Remitente: " + remitente + " | Destinatario: " + destinatario);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Estado actual: " + estado);
        System.out.println("Cantidad de paquetes: " + envio.size());
    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	public EstadoEnvio getEstado() {
		return estado;
	}
	public void setEstado(EstadoEnvio estado) {
		this.estado = estado;
	}
	public List<Paquete> getEnvio() { 
		return envio; 
	}
	
	
	@Override
	public String toString() {
		return "Envio [id=" + id + ", remitente=" + remitente + ", destinatario=" + destinatario + ", direccionEntrega="
				+ direccionEntrega + ", estado=" + estado + "]";
	}
	
	
}
