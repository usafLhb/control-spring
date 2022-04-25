package com.controlProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.controlProject.entities.Livre;
import com.controlProject.service.LivreService; 

@RestController 
public class LivreController {

	@Autowired
	private LivreService service;
	
	@PostMapping("/Addlivre")
	public Livre addProduct(@RequestBody  Livre livre) {
		System.out.print(" Test insertion Livre ");
		return service.saveLivre(livre);
	}
	
	
	@GetMapping("/GetLivre")
	public List<Livre> GetLivre() {
		System.out.print(" Test get  Livre ");
		return service.getLivre();
	}
	
	
	@GetMapping("/GetLivre/{Id}")
	public Livre GetLivre(@PathVariable int Id) {
	 
		return service.findById(Id);
	}
	
	@DeleteMapping("/DeleteLivre/{Id}")
	public String DeleteProduct(@PathVariable int Id) {
		return service.deleteById(Id);
	}
	
	
	@PutMapping("/UpdateLivre/{Id}")
	public Livre UpdateProduct(@RequestBody Livre livre,@PathVariable int Id) {
		System.out.println("Le tout string est "+livre.toString());
		return service.updateLivre(livre,Id);
	}
	
}
