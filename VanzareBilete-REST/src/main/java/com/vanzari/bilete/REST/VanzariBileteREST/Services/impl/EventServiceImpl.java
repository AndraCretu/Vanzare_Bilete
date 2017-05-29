package com.vanzari.bilete.REST.VanzariBileteREST.Services.impl;


import com.vanzari.bilete.REST.VanzariBileteREST.Models.Event;
import com.vanzari.bilete.REST.VanzariBileteREST.Services.EventService;
import com.vanzari.bilete.REST.VanzariBileteREST.Storage.EventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventDAO eventDAO;

    @Override
    public List<Event> getAll() {
        return eventDAO.getAll();
    }

    @Override
    public void deleteById(int id) {
        eventDAO.deleteById(id);
    }
}
