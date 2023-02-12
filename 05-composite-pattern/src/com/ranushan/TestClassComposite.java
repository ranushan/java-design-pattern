package com.ranushan;

public class TestClassComposite {
	
	public static void main(String[] args) {
		// Initialise quatre pieces
		Piece piece1 = new Piece();
		Piece piece2 = new Piece();
		Piece piece3 = new Piece();
		Piece piece4 = new Piece();
		
		// Initialise trois graphiques composites
		Conteneur conteneur = new Conteneur();
		Conteneur conteneur1 = new Conteneur();
		Conteneur conteneur2 = new Conteneur();
		
		// Composes les graphiques		
		conteneur1.ajouter(piece1);
		conteneur1.ajouter(piece2);
		conteneur1.ajouter(piece3);
		
		conteneur2.ajouter(piece4);
		
		conteneur.ajouter(conteneur1);
		conteneur.ajouter(conteneur2);
		
		// Imprimer le graphique complet (quatre fois la cha�ne "Piece").
		conteneur.operation();
		
	}
	
}
