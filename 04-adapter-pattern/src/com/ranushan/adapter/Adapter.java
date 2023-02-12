package com.ranushan.adapter;

import com.ranushan.domain.Personne;

public class Adapter implements ITarget {
	
	private WebServiceAdaptee service = null;

	@Override
	public int request(Personne personne) {
		String stringPersonne = ObjectJson(personne);
		service.request(stringPersonne);
		return 1;
	}
	
	private String ObjectJson(Personne p) {
		return "{Nom : " + p.getNom() + ", Prenom : " + p.getPrenom() + " }";
	}
	
	public void connect(WebServiceAdaptee ws) {
		this.service = ws;
	}

}
