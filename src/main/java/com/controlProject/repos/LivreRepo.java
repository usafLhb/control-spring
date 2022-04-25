package com.controlProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controlProject.entities.Livre;

public interface LivreRepo extends JpaRepository<Livre,Integer> {

}
