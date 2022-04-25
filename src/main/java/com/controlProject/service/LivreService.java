package com.controlProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlProject.entities.Livre;
import com.controlProject.repos.LivreRepo;

@Service
public class LivreService {
	@Autowired
	private LivreRepo repository;
	
	
	public Livre  saveLivre(Livre products) {
		return repository.save(products);
	}
	
	
	public Livre findById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Livre> getLivre() {
		return repository.findAll();
	}
	
	
	public String deleteById(int id) {
		repository.deleteById(id);
		return "Livre deleted successfully";
	}
	
	
public  Livre updateLivre(Livre livre,int id) {
		 
		Livre LivreExisting = repository.findById(id).orElse(null);
	 
		LivreExisting.setAuteur(livre.getAuteur()); 
		LivreExisting.setDate_derniere_consultation(livre.getDate_derniere_consultation());
		LivreExisting.setDate_sortie(livre.getDate_sortie()); 
		LivreExisting.setLivre_disponible(livre.getLivre_disponible());
		LivreExisting.setNombre_page(livre.getNombre_page());
		LivreExisting.setTitre(livre.getTitre()); 
		System.out.println("************");
		return repository.save(LivreExisting);  
	} 
	

}
