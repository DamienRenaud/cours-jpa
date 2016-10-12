package tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Author;


/**
 * Created by Damien on 12/10/2016.
 */
public class TestAuthor {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("td");
        EntityManager em = emf.createEntityManager();

        Author a = em.find(Author.class,1);
        System.out.println("Nom auteur : "+ a.getFirst_name());


        em.close();
        emf.close();
    }
}
