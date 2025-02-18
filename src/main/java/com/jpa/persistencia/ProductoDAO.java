package com.jpa.persistencia;

import com.jpa.entidades.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductoDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardaProducto(Producto producto) throws Exception {
        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
    }

    public Producto buscarProducto(int id) {
        return em.find(Producto.class, id);
    }

    public void actualizarProducto(Producto producto) {
        em.getTransaction().begin();
        em.merge(producto);
        em.getTransaction().commit();
    }

    public void eliminarProducto(int id) {
        Producto producto = em.find(Producto.class, id);
        if (producto != null) {
            em.getTransaction().begin();
            em.remove(producto);
            em.getTransaction().commit();
        }
    }
}