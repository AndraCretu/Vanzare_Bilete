package com.vanzari.bilete.REST.VanzariBileteREST.Services;


import com.vanzari.bilete.REST.VanzariBileteREST.Models.Ticket;

import java.util.List;

/**
 * Created by Robert on 5/14/2017.
 */
public interface TicketService {


    List<Ticket> getAll();

    void add(Ticket ticket);

    Ticket getTicketById(int id);

    void deleteById(int id);

}
