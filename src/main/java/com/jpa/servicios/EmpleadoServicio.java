package com.jpa.servicios;

import java.util.List;
import com.jpa.entidades.Empleado;
import com.jpa.persistencia.EmpleadoDAO;

public class EmpleadoServicio {
    private final EmpleadoDAO daoEmpleado;// Instancio a la unidad d persistencia para acceder a los metodos del EM

    public EmpleadoServicio() {
        this.daoEmpleado = new EmpleadoDAO();
    }

    public Empleado buscarEmplado(int id) {
        return daoEmpleado.buscarEmpleado(id);
    }
      public void listarEmpleados(int id) throws Exception {
        List<Empleado> clientesNombre = daoEmpleado.listarEmpleadosPorId(id);
        imprimirLista(clientesNombre);
    }
    public void imprimirLista(List<Empleado> listaRecibida) {
        for (Empleado unitarioEmpleado : listaRecibida) {
            System.out.println(unitarioEmpleado.getNombre() + "-" + unitarioEmpleado.getApellido() + "-"
                    + unitarioEmpleado.getPuesto());
        }
    }    
}
