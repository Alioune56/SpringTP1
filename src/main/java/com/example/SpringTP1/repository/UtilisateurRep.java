package com.example.SpringTP1.repository;

import com.example.SpringTP1.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UtilisateurRep extends JpaRepository<Utilisateur,Long> {
    public Iterable<Utilisateur> findByNom(String Nom);
}

