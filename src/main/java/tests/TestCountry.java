package tests;

import entities.Country;
import services.CountryService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Damien on 12/10/2016.
 */
public class TestCountry {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("td");
        EntityManager em = emf.createEntityManager();
        CountryService cs = new CountryService();

        Country c = cs.find(em,"FR");
        System.out.println("Code : "+ c.getCode() + " - Country : " + c.getName());






        em.close();
        emf.close();
    }
}
