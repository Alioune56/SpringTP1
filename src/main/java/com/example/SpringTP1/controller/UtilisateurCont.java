package com.example.SpringTP1.controller;

import com.example.SpringTP1.entity.Utilisateur;
import com.example.SpringTP1.interfaces.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UtilisateurCont {
    // Afficher une page
    @GetMapping("/")
    public String HomePage(Model model){
        model.addAttribute("utilisateur",new Utilisateur());
        return "admin/auth/welcome";
    }
    @GetMapping("/newUser")
    public String ShowPageUser(Model model){
        Utilisateur utilisateur=new Utilisateur();
        model.addAttribute("utilisateur",utilisateur);
        return "admin/auth/newUser";
    }
    @Autowired
    UtilisateurService us;
    @PostMapping("/newUser/save")
    public String ajouterUser(@ModelAttribute("utlilisateur") Utilisateur utilisateur, BindingResult result, Model model){
        us.ajouter(utilisateur);
        return "redirect:/newUser?Succes";

    }

}
