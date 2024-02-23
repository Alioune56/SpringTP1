package com.example.SpringTP1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor // constructeur avec les arguments
@Data // getter et setter
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prenom;
    private String nom;
    private String login;
    private String password;

}
