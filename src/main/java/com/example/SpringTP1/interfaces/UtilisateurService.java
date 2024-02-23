package com.example.SpringTP1.interfaces;

import com.example.SpringTP1.entity.Utilisateur;
import com.example.SpringTP1.repository.UtilisateurRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService implements UtilisateurInt{
    // Methode repository
    @Autowired
    private UtilisateurRep ur;

    // Ajouter un Utilisateur
    @Override
    public Utilisateur ajouter(Utilisateur u) {
        if(u.getId()==0){
            return ur.save(u);
        }
        else {
            Utilisateur um = ur.findById(u.getId()).get();
            um.setPrenom(u.getPrenom());
            um.setNom(u.getNom());
            u.setLogin(u.getLogin());
            u.setPassword(u.getPassword());
            return ur.save(um);
        }


    }

    // Recherche par Id
    @Override
    public Utilisateur rechercheId(Long id) {
        Optional<Utilisateur> opt = ur.findById(id);
        Utilisateur u = null;
        if(opt.isPresent()){
            u = opt.get();
        }
        else {
            throw new RuntimeException("login ou Password incorrect"+id);
        }
        return u;
    }

    // Lister les utilisateurs
    @Override
    public List<Utilisateur> liste() {
        ur.findAll();
        return null;
    }

    // Supprimer
    @Override
    public void supprimer(Long id) {
        ur.deleteById(id);
    }

    // Liste des utilisateur par nom
    @Override
    public Iterable<Utilisateur> rechercheNom(String nom) {
        return ur.findByNom(nom);
    }


}
