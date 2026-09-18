package ar.edu.unju.fi.poo.pto2.model;

public class Vehiculo {

    private String patente;
    private double capacidadPeso;
    private double capacidadVolumen;

    public Vehiculo(String patente, double capacidadPeso, double capacidadVolumen) {
        super();
        this.patente = patente;
        this.capacidadPeso = capacidadPeso;
        this.capacidadVolumen = capacidadVolumen;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapacidadPeso() {
        return capacidadPeso;
    }

    public void setCapacidadPeso(double capacidadPeso) {
        this.capacidadPeso = capacidadPeso;
    }

    public double getCapacidadVolumen() {
        return capacidadVolumen;
    }

    public void setCapacidadVolumen(double capacidadVolumen) {
        this.capacidadVolumen = capacidadVolumen;
    }

    @Override
    public String toString() {
        return "Vehiculo [patente=" + patente + ", capacidadPeso=" + capacidadPeso + ", capacidadVolumen="
                + capacidadVolumen + "]";
    }
}