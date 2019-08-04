package sda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.entity.Clienti;
import sda.services.ClientiService;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("/nouclient")

public class NouClientHtml {

    @Autowired
    ClientiService service;

    @GetMapping("")
    public String showPage(Model model) {

        return "nouclient";
    }




}