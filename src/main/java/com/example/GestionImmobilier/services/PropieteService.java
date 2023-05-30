package com.example.GestionImmobilier.services;

import com.example.GestionImmobilier.entities.Locateur;
import com.example.GestionImmobilier.entities.Propriete;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PropieteService {
    Propriete savePropriete(Propriete propriete);
    Propriete updatePropriete(Propriete propriete);
    Propriete getPropriete(Long id);
    List<Propriete> getAllPropriete();
    void deleteProprieteById(Long id);
    void deleteAllProducts();

    List<Propriete> findAllProprieteByPrix(Double prix);
    List<Propriete> findAllProprieteByAdresse(@Param("adresse") String adresse , @Param("prix") Double prix);
    List<Propriete> findAllProprieteByLocateur(Locateur locateur);
    List<Propriete> findAllProprieteByAdresseSort();

    Page<Propriete> getAllProprieteByPage(int page, int size);
}
