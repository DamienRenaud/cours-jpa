package services;

import crud.CRUDInterface;
import entities.Country;

import javax.persistence.EntityManager;

/**
 * Created by Damien on 12/10/2016.
 */
public class CountryService {


    public Country find(EntityManager em, int id) {
        return em.find(Country.class,id);
    }

    public void create(EntityManager em, Country object) {
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
    }

    public void update(EntityManager em, Country object) {
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
    }

    public void delete(EntityManager em, int id) {
        em.getTransaction().begin();
        em.remove(em.find(Country.class,id));
        em.getTransaction().commit();
    }

    public void delete(EntityManager em, Country object) {
        em.getTransaction().begin();
        em.remove(object);
        em.getTransaction().commit();
    }
}
