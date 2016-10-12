package tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Damien on 12/10/2016.
 */
public class TestPersistenceUnit {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("td");
        EntityManager em = emf.createEntityManager();

        System.out.println(em.getClass());

        if(em.isOpen())
            System.out.println("Winner");

        em.close();

        if(!em.isOpen())
            System.out.println("Closed");

        emf.close();
    }
}
