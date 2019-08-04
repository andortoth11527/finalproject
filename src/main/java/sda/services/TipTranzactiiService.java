package sda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import sda.entity.Tranzactii;
import sda.entity.TipTranzactii;
import sda.model.TipTranzactiiDTO;
import sda.repository.ClientiRepository;
import sda.repository.ContRepository;
import sda.repository.TipTranzactieRepository;
import sda.repository.TranzactieRepository;

import java.util.*;
@Service
public class TipTranzactiiService {
    @Autowired
    ClientiRepository clientiRepository;

    @Autowired
    ContRepository contRepository;

    @Autowired
    TipTranzactieRepository tipTranzactieRepository;

    @Autowired
    TranzactieRepository tranzactieRepository;

    public List<TipTranzactii> findAll(){


        return tipTranzactieRepository.findAll();
    }





}
