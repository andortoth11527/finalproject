package sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sda.entity.Clienti;
import sda.services.ClientiService;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("/client")

public class ClientHtmlController {

    @Autowired
    ClientiService service;

    @GetMapping("")
    public String showPage(Model model) {
        List<Clienti> all = service.findAll();
        model.addAttribute("clienti", all);
        return "client";
    }

    @GetMapping (value = "/find/{id}")
    public String getClientById(Model model, @PathVariable("id") String  id,
                                @PathParam("clientId") String clientId){

        List<Clienti> byId = service.findByID(Integer.valueOf(clientId));
        model.addAttribute("clienti", byId);
        return "client";
    }

    @GetMapping(value = "/inscriere")
    public String addClient(Model model, @PathParam("user") String user,
                            @PathParam("cnp") String cnp){

        Clienti nouClient = service.createClient(user, cnp);

        model.addAttribute("nouClient", nouClient);

        return "redirect:/client";

    }







}
