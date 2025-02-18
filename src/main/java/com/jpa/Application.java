package com.jpa;

import com.jpa.entidades.Empleado;
import com.jpa.servicios.ClienteServicio;
import com.jpa.servicios.EmpleadoServicio;
import com.jpa.servicios.GamaProductoServicio;
import com.jpa.servicios.OficinaServicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando la conexion con la base de datos");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
        EntityManager em = emf.createEntityManager();

        OficinaServicio oficinaServicio = new OficinaServicio();
        ClienteServicio clienteServicio = new ClienteServicio();
        Empleado empleado = (new EmpleadoServicio()).buscarEmplado(1);
        GamaProductoServicio gamaProductoServicio = new GamaProductoServicio();
        EmpleadoServicio empleadoServicio = new EmpleadoServicio();

        // oficinaServicio.crearOficna("OFI01", "Mendoza", "Argentina", "Cuyo",
        // "11111111",
        // "CP5000");

        // clienteServicio.crearCliente(123423580, "Marcos", "Contreras", "999999999",
        // "9999999999", "Viedma", "Río Negro",
        // "Argentina", "8500", 21341234.23, 0202);

        System.out.println("OFICINAS DISPONIBLES:");
        oficinaServicio.listarOficinas();
        System.out.println("CLIENTES POR NOMBRE:");
        clienteServicio.listarClientesPorNombre("Anne");
        System.out.println("EMPLEADOS POR ID:");
        empleadoServicio.listarEmpleados(1);

    }
}
