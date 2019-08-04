package sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sda.entity.Tranzactii;
import sda.services.TranzactiiService;

import java.util.List;
@RestController
@RequestMapping("/api")

public class TranzactiiController {

    @Autowired
    TranzactiiService service;

    @GetMapping("/all3")
    public List<Tranzactii> getAll(){

        return service.findAll();
    }

}
