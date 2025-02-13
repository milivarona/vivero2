package com.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    public static void main(String[] args) {
        System.out.println("Iniciando la conexion con la base de datos");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");

        @SuppressWarnings("unused") //Solo para evitar el warning de que no se esta utilizando la variable, luego quitar.
        EntityManager em = emf.createEntityManager();

        System.out.println("No hubo errores en la conexion con la base de datos");
    }
}
