package com.example.SpringTP1.interfaces;

import com.example.SpringTP1.entity.Utilisateur;

import java.util.List;

public interface UtilisateurInt {
    // Methode Ajouter
    public Utilisateur ajouter(Utilisateur u);

    // Methode recherche Id
    public Utilisateur rechercheId(Long id);

    // Methode liste
    public List<Utilisateur> liste();

    // Methode Supprimer
    public void supprimer(Long id);

    // Recherche par nom
    public Iterable<Utilisateur> rechercheNom(String nom);

}
