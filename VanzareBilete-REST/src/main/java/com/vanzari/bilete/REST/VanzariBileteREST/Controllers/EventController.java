package com.vanzari.bilete.REST.VanzariBileteREST.Controllers;

import com.vanzari.bilete.REST.VanzariBileteREST.Models.Event;
import com.vanzari.bilete.REST.VanzariBileteREST.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Robert on 5/20/2017.
 */
@RestController
@RequestMapping("/list_events")
public class EventController {

    @Autowired
    private EventService casualtyService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Event> getCasualty(@RequestParam(required = false) Map<String, String> q){
        return casualtyService.getAll();

    }
}
