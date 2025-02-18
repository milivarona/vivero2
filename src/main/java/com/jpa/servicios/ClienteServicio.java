package com.jpa.servicios;

import java.util.List;

import com.jpa.entidades.Cliente;
import com.jpa.entidades.Cliente;
import com.jpa.persistencia.ClienteDAO;

public class ClienteServicio {
    private final ClienteDAO daoCliente;// Instancio a la unidad d persistencia para acceder a los metodos del EM

    public ClienteServicio() {
        this.daoCliente = new ClienteDAO();
    }

    public void crearCliente(int codigodCliente, String nombreContacto, String apellidoContacto,
            String telefono, String fax, String ciudad, String region, String pais, String codigoPostal,
            Double limiteCredito, int idEmpleado) {

        try {
            // Crear una nueva instancia de Cliente
            Cliente clienteNueva = new Cliente();

            clienteNueva.setCodigoCliente(codigodCliente);
            clienteNueva.setNombreContacto(nombreContacto);
            clienteNueva.setApellidoContacto(apellidoContacto);
            clienteNueva.setTelefono(telefono);
            clienteNueva.setFax(fax);
            clienteNueva.setCiudad(ciudad);
            clienteNueva.setRegion(region);
            clienteNueva.setPais(pais);
            clienteNueva.setCodigoPostal(codigoPostal);
            clienteNueva.setLimiteCredito(limiteCredito);
            clienteNueva.setIdEmpleado(idEmpleado);

            // Llamar al método de ClienteDAO para guardar la nueva cliente
            daoCliente.guardaCliente(clienteNueva);

        } catch (Exception e) {
            System.out.println(e.toString() + "No se guardo la nueva cliente de manera correcta");
        }

    }
    public void listarClientesPorNombre(String nombreRecibido) throws Exception {
        List<Cliente> clientesNombre = daoCliente.listarClientesPorNombre(nombreRecibido);
        imprimirLista(clientesNombre);
    }
   
    public void imprimirLista(List <Cliente> listaRecibida) throws Exception{
        for (Cliente unitariaCliente : listaRecibida){
            System.out.println(unitariaCliente.getCodigoCliente() + " - " + unitariaCliente.getCiudad() + " - " + unitariaCliente.getPais() );
        }
    }

    // Imprimo solo algunos datos de la BBDD
    public void imprimirAlgunosDatos(List<Cliente> listaRecibida) {
        for (Cliente unitarioCliente : listaRecibida) {
            System.out.println(unitarioCliente.getIdCliente() + "-" + unitarioCliente.getApellidoContacto() + "-"
                    + unitarioCliente.getNombreContacto());
        }


    }

}
