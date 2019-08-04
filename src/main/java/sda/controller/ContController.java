package sda.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sda.entity.Cont;
import sda.services.ContService;


import java.util.List;

@RestController
@RequestMapping("/api")

public class ContController {

    @Autowired
    ContService service;

    @GetMapping("/all4")
    public List<Cont> getAll() {

        return service.findAll();
    }


}
