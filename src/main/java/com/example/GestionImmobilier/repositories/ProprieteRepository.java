package com.example.GestionImmobilier.repositories;

import com.example.GestionImmobilier.entities.Locateur;
import com.example.GestionImmobilier.entities.Propriete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProprieteRepository extends JpaRepository<Propriete,Long> {
    @Query("select propriete from Propriete propriete where propriete.prix>?1")
    List<Propriete> findAllProprieteByPrix(Double prix);
    @Query("select propriete from Propriete propriete where propriete.adresse like %:adresse and propriete.prix>:prix")
    List<Propriete> findAllProprieteByAdresse(@Param("adresse") String adresse ,@Param("prix") Double prix);
    @Query("select propriete from Propriete propriete where propriete.locateur =?1")
    List<Propriete> findAllProprieteByLocateur(Locateur locateur);
    @Query("select propriete from Propriete propriete order by propriete.adresse")
    List<Propriete> findAllProprieteByAdresseSort();


}
