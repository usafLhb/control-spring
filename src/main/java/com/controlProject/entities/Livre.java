package com.controlProject.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name="LIVRE")
@ToString
public class Livre {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column( nullable=false ,length=50)
	private String titre;
	
	@Column( nullable=false,updatable=false)
	private String maison_edition;
	
	@Column( nullable=false)
	private Date date_sortie;
	
	@Column( nullable=false)
	private String auteur;
	
	@Column( nullable=false)
	private int nombre_page;
	
	@Column(unique=true , nullable=false,updatable=false)
	private int ISBN;
	
	@Column( nullable=false)
	private Date date_derniere_consultation;
	
	@Column( nullable=false)
	private Boolean livre_disponible;
	
	
}
