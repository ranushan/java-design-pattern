package com.ranushan;

import com.ranushan.adapter.Adapter;
import com.ranushan.adapter.WebServiceAdaptee;
import com.ranushan.domain.Personne;

public class TestClassAdapter {

	public static void main(String[] args) {
		
		// 1. On cree la personne
		Personne p = new Personne();
		
		// 2. On cree l'adapter
		Adapter adapter = new Adapter();
		
		// 3. On set le nom et prenom 
		p.setNom("Jean");
		p.setPrenom("DuJardin");
		
		// 4. On se connecte
		adapter.connect(new WebServiceAdaptee());
		
		// 5. On demande la requete
		adapter.request(p);

	}

}
