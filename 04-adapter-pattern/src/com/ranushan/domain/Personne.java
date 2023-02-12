package com.ranushan.domain;

public class Personne {
	
	// Attribut
	
	private String nom;
	private String prenom;
	
	// Getters & Setters
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// Override toString
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	// Constructor
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne() {
		
	}
	
}
