package com.vanzari.bilete.REST.VanzariBileteREST.Services.impl;

import com.vanzari.bilete.REST.VanzariBileteREST.Models.Ticket;
import com.vanzari.bilete.REST.VanzariBileteREST.Services.TicketService;
import com.vanzari.bilete.REST.VanzariBileteREST.Storage.TicketDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Robert on 5/14/2017.
 */

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDAO casualtyCount;

    @Override
    public List<Ticket> getAll() {
        return casualtyCount.getAll();
    }

    @Override
    public void add(Ticket ticket) {
        casualtyCount.add(ticket);
    }

    @Override
    public Ticket getTicketById(int id) {
        return casualtyCount.getTicketById(id);
    }

    @Override
    public void deleteById(int id) {
       Ticket result = casualtyCount.getTicketById(id);
        casualtyCount.remove(result);
    }
}
