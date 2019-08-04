package sda.services;


import ch.qos.logback.core.net.server.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import sda.entity.Clienti;
import sda.entity.TipTranzactii;
import sda.model.ClientiDTO;
import sda.repository.ClientiRepository;
import sda.repository.ContRepository;
import sda.repository.TipTranzactieRepository;
import sda.repository.TranzactieRepository;

import java.util.*;


@Service
public class ClientiService {
    @Autowired
    ClientiRepository clientiRepository;

    @Autowired
    ContRepository contRepository;

    @Autowired
    TipTranzactieRepository tipTranzactieRepository;

    @Autowired
    TranzactieRepository tranzactieRepository;

    public List<Clienti> findAll() {
        return clientiRepository.findAll();
    }

    //TODO create a method to return a client by ID from the repository;
    public List<Clienti> findByID(int id) {
        List<Clienti> clienti = new ArrayList<>();
        clienti.add(clientiRepository.findById(id).get());
        return clienti;
    }

    //TODO create a method to return a client by User from the repository;
    public List<Clienti> findByUser(String user) {

        return clientiRepository.findByUser(user);
    }

    public Clienti createClient(String nume, String cnp) {

        Clienti newClient = new Clienti();
        newClient.setCnp(Long.valueOf(cnp));
        newClient.setUser(nume);

        Clienti c = clientiRepository.save(newClient);

        return c;
    }
}








