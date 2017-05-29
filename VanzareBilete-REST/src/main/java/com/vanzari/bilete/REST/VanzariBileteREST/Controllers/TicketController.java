package com.vanzari.bilete.REST.VanzariBileteREST.Controllers;

import com.vanzari.bilete.REST.VanzariBileteREST.Services.TicketService;
import com.vanzari.bilete.REST.VanzariBileteREST.Storage.TicketDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.vanzari.bilete.REST.VanzariBileteREST.Models.Ticket;

import java.util.List;
import java.util.Map;

//deleted 2 lines, added one

/**
 * Created by Robert on 5/14/2017.
 */
@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @Autowired
    private TicketDAO ticketDAO;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ticket> getCasualty(@RequestParam(required = false) Map<String, String> q){
        return ticketService.getAll();

    }

    @RequestMapping(value = "/ticket_details/{id}", method = RequestMethod.GET)
    public com.vanzari.bilete.REST.VanzariBileteREST.Models.Ticket getBiletById(@PathVariable int id){
        return  ticketService.getTicketById(id);
}

    @RequestMapping(value = "/cancel_ticket/{id}", method = RequestMethod.POST)
    @ResponseStatus(value= HttpStatus.OK)
    public  void deleteBilet ( @PathVariable("id") int  id){
        ticketService.deleteById(id);
    }
   /* @RequestMapping(value = "/cancel_ticket/{id}", method = RequestMethod.DELETE)
    public void  remove(@PathVariable int id){
        biletService.deleteById(id);
    }*/
    @RequestMapping(method = RequestMethod.POST)
    public void  add(@RequestBody Ticket ticket){
        ticketService.add(ticket);
    }
}
