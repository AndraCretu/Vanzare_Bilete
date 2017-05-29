package com.vanzari.bilete.REST.VanzariBileteREST.Storage.impl;

import com.vanzari.bilete.REST.VanzariBileteREST.Models.Ticket;
import com.vanzari.bilete.REST.VanzariBileteREST.Storage.TicketDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Robert on 5/14/2017.
 */
@Repository
public class JpaTicketDAO implements TicketDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ticket> getAll() {
        TypedQuery<Ticket> query = entityManager.createQuery("select b from Ticket b ", Ticket.class);
        return query.getResultList();
    }
    @Transactional
    @Override
    public void remove(Ticket ticket) {
        entityManager.remove(ticket);
    }

    @Transactional
    @Override
    public void add(Ticket ticket) {
        entityManager.persist(ticket);
    }

    @Override
    public Ticket getTicketById(int id) {
        TypedQuery<Ticket> query = entityManager.createQuery("select d from Ticket d where ID = :id", Ticket.class).setParameter("id", id);
        return query.getResultList().get(0);
    }

}
