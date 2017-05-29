package com.vanzari.bilete.REST.VanzariBileteREST.Storage;

import com.vanzari.bilete.REST.VanzariBileteREST.Models.*;
import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
public interface EventDAO {
    List<Event> getAll();


    void deleteById(int id);

    void add(Event event);

    void remove(Event event);

    void update(Event event);
}
