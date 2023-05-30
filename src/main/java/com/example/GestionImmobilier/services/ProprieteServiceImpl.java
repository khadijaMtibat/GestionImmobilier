package com.example.GestionImmobilier.services;

import com.example.GestionImmobilier.entities.Locateur;
import com.example.GestionImmobilier.entities.Propriete;
import com.example.GestionImmobilier.repositories.ProprieteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprieteServiceImpl implements PropieteService{
    @Autowired
    ProprieteRepository proprieteRepository;

    @Override
    public Propriete savePropriete(Propriete propriete) {
        return proprieteRepository.save(propriete);
    }

    @Override
    public Propriete updatePropriete(Propriete propriete) {
        return proprieteRepository.save(propriete);
    }

    @Override
    public Propriete getPropriete(Long id) {
        return proprieteRepository.findById(id).get();
    }

    @Override
    public List<Propriete> getAllPropriete() {
        return proprieteRepository.findAll();
    }

    @Override
    public void deleteProprieteById(Long id) {
        proprieteRepository.deleteById(id);

    }

    @Override
    public void deleteAllProducts() {
        proprieteRepository.deleteAll();

    }

    @Override
    public List<Propriete> findAllProprieteByPrix(Double prix) {
        return proprieteRepository.findAllProprieteByPrix(1200000.0);
    }

    @Override
    public List<Propriete> findAllProprieteByAdresse(String adresse, Double prix) {
        return proprieteRepository.findAllProprieteByAdresse("safi 1",	1200000.0);
    }

    @Override
    public List<Propriete> findAllProprieteByLocateur(Locateur locateur) {
        return proprieteRepository.findAllProprieteByLocateur(locateur);
    }

    @Override
    public List<Propriete> findAllProprieteByAdresseSort() {
        return proprieteRepository.findAllProprieteByAdresseSort();
    }

    @Override
    public Page<Propriete> getAllProprieteByPage(int page, int size) {
        return proprieteRepository.findAll(PageRequest.of(page, size));
    }
}
