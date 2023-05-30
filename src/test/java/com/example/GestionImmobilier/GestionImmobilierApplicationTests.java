package com.example.GestionImmobilier;

import com.example.GestionImmobilier.entities.Locateur;
import com.example.GestionImmobilier.entities.Propriete;
import com.example.GestionImmobilier.repositories.ProprieteRepository;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

@SpringBootTest
class GestionImmobilierApplicationTests {
	@Autowired
	ProprieteRepository proprieteRepository;

	@Test
	public void TestCreatePropriete(){
		Propriete propriete=new Propriete("Ibnoukatir Maarif ","Maison","150²",12500000.00,true);
		proprieteRepository.save(propriete);
	}
	@Test
	public void TestUpdatePropriete(){
		Propriete propriete = proprieteRepository.findById(1L).get();
		propriete.setPrix(10000000.00);
		proprieteRepository.save(propriete);
	}
	@Test
	void TestFindProprieteById() {
		Propriete propriete=proprieteRepository.findById(1L).get();
		System.out.println(propriete);
	}
	@Test
	public void TestFindAllProprites() {
		List<Propriete> proprietes = proprieteRepository.findAll();
		for (Propriete p : proprietes) {
			System.out.println(p);

		}


		//proprietes.forEach(System.out:println);

	}
	@Test
	public void TestDeleteProprieteById(){
		proprieteRepository.deleteById(1L);

	}
	@Test
	public void TestDeleteAllProprieteById(){
		proprieteRepository.deleteAll();

	}
	@Test
	public void TestfindAllProprieteByPrix(){
		List<Propriete> proprietes=proprieteRepository.findAllProprieteByPrix(12000.00);
		proprietes.forEach(System.out::println);
	}
	@Test
	public void TestfindAllProprieteByAdresse(){
		List<Propriete> proprietes=proprieteRepository.findAllProprieteByAdresse("safi 1",12000.00);
		proprietes.forEach(System.out::println);
	}
	@Test
	public void TestfindAllProprieteByLocateur(){
		Locateur locateur = new Locateur();
		locateur.setId_loc(1L);
		List<Propriete> proprietes=proprieteRepository.findAllProprieteByLocateur(locateur);
		proprietes.forEach(System.out::println);
	}
	@Test
	public void TestfindAllProprieteByAdresseSort(){
		List<Propriete> proprietes=proprieteRepository.findAllProprieteByAdresseSort();
		proprietes.forEach(System.out::println);
	}







}
