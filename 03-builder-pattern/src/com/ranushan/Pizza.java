package com.ranushan;

// Classe Principale : Pizza

public class Pizza {
	
	// Attributs
	
	private int taille;
	private boolean fromage;
	private boolean bacon;
	private boolean pepperoni;
	
	// Getters et Setters 	
	
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public boolean isFromage() {
		return fromage;
	}
	public void setFromage(boolean fromage) {
		this.fromage = fromage;
	}
	public boolean isBacon() {
		return bacon;
	}
	public void setBacon(boolean bacon) {
		this.bacon = bacon;
	}
	public boolean isPepperoni() {
		return pepperoni;
	}
	public void setPepperoni(boolean pepperoni) {
		this.pepperoni = pepperoni;
	}
	
	// Override toString
	
	@Override
	public String toString() {
		return "Pizza [taille=" + taille + ", fromage=" + fromage + ", bacon=" + bacon + ", pepperoni=" + pepperoni
				+ "]";
	}
	
	// Constructor
	
	private Pizza(Builder builder) {
		this.taille = builder.taille;
		this.fromage = builder.fromage;
		this.bacon = builder.bacon;
		this.pepperoni = builder.pepperoni;
	}
	
	// Class Secondaire : Builder
	
	public static class Builder{
		
		// Attributs
		
		private int taille;
		private boolean fromage;
		private boolean bacon;
		private boolean pepperoni;
		
		// Builder
		
		public Builder taille(int taille) {
			this.taille = taille;
			return this;
		}
		
		public Builder fromage(boolean fromage) {
			this.fromage = fromage;
			return this;
		}
		
		public Builder bacon(boolean bacon) {
			this.bacon = bacon;
			return this;
		}
		
		public Builder pepperoni(boolean pepperoni) {
			this.pepperoni = pepperoni;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}
		
	}
	
}
	