package com.vanzari.bilete.REST.VanzariBileteREST.Services;

import com.vanzari.bilete.REST.VanzariBileteREST.Models.Event;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
public interface EventService {

    List<Event> getAll();

    void deleteById(int id);


}
