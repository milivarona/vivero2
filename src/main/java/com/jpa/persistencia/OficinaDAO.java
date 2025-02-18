package com.jpa.persistencia;

import java.util.List;

import com.jpa.entidades.Oficina;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OficinaDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarOficina(Oficina oficina) {
        em.getTransaction().begin();
        em.persist(oficina);
        em.getTransaction().commit();
    }

    public Oficina buscarOficina(int id) {
        return em.find(Oficina.class, id);
    }

    public void actualizarOficina(Oficina oficina) {
        em.getTransaction().begin();
        em.merge(oficina);
        em.getTransaction().commit();
    }

    public void eliminarOficina(int id) {
        Oficina oficina = em.find(Oficina.class, id);
        if (oficina != null) {
            em.getTransaction().begin();
            em.remove(oficina);
            em.getTransaction().commit();
        }
    }
    public  List <Oficina> listarTodas()throws Exception{
        return em.createQuery("SELECT o FROM Oficina o", Oficina.class)
        .getResultList() ;
       }  

}
