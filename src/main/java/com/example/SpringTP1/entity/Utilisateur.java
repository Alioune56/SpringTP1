package com.example.SpringTP1.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String prenom;
    private String nom;
    private String login;
    private String password;
    private Date date;
}
