package ar.edu.unju.fi.poo.pto2.main;

import java.time.LocalDate;
import ar.edu.unju.fi.poo.pto2.manager.ManagerEnvios;
import ar.edu.unju.fi.poo.pto2.model.Envio;
import ar.edu.unju.fi.poo.pto2.model.Paquete;
import ar.edu.unju.fi.poo.pto2.model.RutaEnvio;
import ar.edu.unju.fi.poo.pto2.model.Vehiculo;

public class MainEnvios {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   PRUEBA DE OPERACIONES DE NEGOCIO - LOGÍSTICA   ");
        System.out.println("==================================================\n");

        // 1. Instanciar el gestor de envíos y vehículos
        ManagerEnvios manager = new ManagerEnvios();

        // 2. Registrar Vehículos (Patente, Capacidad Peso [kg], Capacidad Volumen [dm³])
        Vehiculo vehiculo1 = new Vehiculo("AF123JK", 150.0, 400.0);
        Vehiculo vehiculo2 = new Vehiculo("AE987XY", 50.0, 100.0);

        manager.agregarVehiculo(vehiculo1);
        manager.agregarVehiculo(vehiculo2);

        // 3. Crear Paquetes (Código, Descripción, Peso [kg], Volumen [dm³])
        Paquete paquete1 = new Paquete("P001", "Caja con Libros", 20.0, 15.0);
        Paquete paquete2 = new Paquete("P002", "Monitor Gamer 27", 8.5, 30.0);
        Paquete paquete3 = new Paquete("P003", "Teclado Mecánico", 3.0, 10.0);

        // 4. Crear Envíos (ID, Remitente, Destinatario, Dirección)
        Envio envio1 = new Envio(101, "Carlos López", "Ana Martínez", "Av. Belgrano 456", null);
        Envio envio2 = new Envio(102, "Distribuidora Jujuy", "Pedro Gómez", "Calle San Martín 890", null);

        // 5. Agregar paquetes a los envíos (Operación: agregarPaquete)
        System.out.println("--- Agregando paquetes a los envíos ---");
        envio1.agregarPaquete(paquete1);
        envio1.agregarPaquete(paquete2);
        envio2.agregarPaquete(paquete3);

        manager.agregarEnvio(envio1);
        manager.agregarEnvio(envio2);

        // 6. Crear Ruta Diaria y asignar vehículo
        RutaEnvio rutaHoy = new RutaEnvio(LocalDate.now().toString(), vehiculo1);

        // 7. Asignar envíos a la ruta (Operación: asignarRuta)
        System.out.println("\n--- Asignando envíos a la ruta diaria ---");
        rutaHoy.asignarRuta(envio1);
        rutaHoy.asignarRuta(envio2);

        // 8. Cambiar estados de envíos (Operaciones: despachar, devolver)
        System.out.println("\n--- Despachando envío 101 ---");
        envio1.despachar();

        System.out.println("\n--- Registrando devolución del envío 102 ---");
        envio2.devolver();

        // 9. Mostrar información detallada de cada envío (Operación: mostrarInfo)
        System.out.println("\n==================================================");
        System.out.println("        DETALLE Y ESTADO FINAL DE ENVÍOS          ");
        System.out.println("==================================================");
        envio1.mostrarInfo();
        System.out.println("--------------------------------------------------");
        envio2.mostrarInfo();
        System.out.println("==================================================");

        // 10. Listar todos los envíos y vehículos desde el manager
        System.out.println("\n--- Listado general en ManagerEnvios ---");
        manager.mostrarEnvios();
        manager.mostrarVehiculos();
    }
}