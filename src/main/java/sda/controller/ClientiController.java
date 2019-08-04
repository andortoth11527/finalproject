package sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sda.entity.Clienti;
import sda.model.ClientiDTO;
import sda.services.ClientiService;

import javax.activation.MimeType;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientiController {

    @Autowired
    ClientiService service;

    @GetMapping(value="/all", produces = "application/json")
    public List<Clienti> getAll(){
        return service.findAll();
    }

    @GetMapping (value = "/{id}", produces = "application/json")
    public String getClientById(@PathVariable("id") String id){
        //TODO use clientService to retrive the client by ID
        return "{\"id\": \"bla\"}";
    }






            


















}
