package com.example.GestionImmobilier.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Locateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_loc;
    private String nom;
    private String adresse;
    private String num_tel;
    private String email;
    @OneToMany(mappedBy = "locateur")
    private List<Propriete> proprietes;

}
