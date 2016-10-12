package crud;

import javax.persistence.EntityManager;

/**
 * Created by Damien on 12/10/2016.
 */
public interface CRUDInterface<T> {

    T find(EntityManager em, Object id);
    void create(EntityManager em, T object);
    void update(EntityManager em, T object);
    void delete(EntityManager em, int id);
    void delete(EntityManager em, T object);
}
