package application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import application.repositories.AutorRepository;

@Controller
@RequestMapping("/autor")
public class AutorController {
@Autowired
private AutorRepository autoRepo;


@RequestMapping("/list")
public String list(Model model){
    model.addAttribute("autores", autoRepo.findAll());
    return "list.jsp";

}
    
}
