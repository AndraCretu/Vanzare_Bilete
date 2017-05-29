package com.vanzari.bilete.REST.VanzariBileteREST.Storage.impl;

import com.vanzari.bilete.REST.VanzariBileteREST.Models.Event;
import com.vanzari.bilete.REST.VanzariBileteREST.Storage.EventDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
@Repository
public class JpaEvenimentDAO implements EventDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Event> getAll() {
        TypedQuery<Event> query = entityManager.createQuery(
                "select d from Event d", Event.class
        );

        return query.getResultList();
    }

    @Override
    public void deleteById(int id) {
        TypedQuery<Event> query = entityManager.createQuery(
                "delete from Event where ID=:id", Event.class)
                .setParameter("id", id);
    }

    @Override
    public void add(Event event) {

    }

    @Override
    public void remove(Event event) {

    }

    @Override
    public void update(Event event) {

    }

}
