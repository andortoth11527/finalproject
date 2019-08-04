package sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.entity.Clienti;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeHtmlController {

    @GetMapping("")
    public String showPage(Model model) {

        return "home";
    }
}
