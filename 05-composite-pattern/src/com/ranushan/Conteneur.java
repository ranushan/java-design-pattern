package com.ranushan;

import java.util.ArrayList;
import java.util.List;


public class Conteneur implements Composant{
	
	List<Composant> composants = new ArrayList<>();
	
	@Override
	public void operation() {
		
		for (Composant graphic : composants) {
			graphic.operation();
		}
		
	}

	public void ajouter(Composant composant) {
		composants.add(composant);
	}
	
	public void retirer(Composant composant) {
		composants.remove(composant);
	}
	
	public List<Composant> getEnfants(){
		return composants;
	}	
	
}
