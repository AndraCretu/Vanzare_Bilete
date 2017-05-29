package com.vanzari.bilete.REST.VanzariBileteREST.Storage;

import com.vanzari.bilete.REST.VanzariBileteREST.Models.Ticket;

import java.util.List;

/**
 * Created by Robert on 5/14/2017.
 */
public interface TicketDAO {

     List<Ticket> getAll();

     void remove(Ticket ticket);

     void add(Ticket ticket);

    Ticket  getTicketById(int id);

}
