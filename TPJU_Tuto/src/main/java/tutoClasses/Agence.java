package tutoClasses;

import java.util.ArrayList;  

public class Agence {

	private String nom;
	private String ville;
	private ArrayList<Immobilier> immobiliers; 
	private ArrayList<Immobilier> promotions;
	
	public Agence(String nom, String ville, ArrayList<Immobilier> immobiliers, ArrayList<Immobilier> promotions) {
		this.nom=nom;
		this.ville=ville;
		this.immobiliers=immobiliers;
		this.promotions=promotions;
	}
	 
	 

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public ArrayList<Immobilier> getImmobiliers() {
		return immobiliers;
	}
	public void setImmobiliers(ArrayList<Immobilier> immobiliers) {
		this.immobiliers = immobiliers;
	}
	
	public ArrayList<Immobilier> getPromotions() {
		return promotions;
	}



	public void setPromotions(ArrayList<Immobilier> promotions) {
		this.promotions = promotions;
	}



	public void addImmobilier(Immobilier i) {
		immobiliers.add(i);
	}
	
	public void addImmobilier(ArrayList<Immobilier> im) {
		for(int i=0; i<im.size(); i++) {
			immobiliers.add(im.get(i));
		}
	}
	
	public void promotion(String type) {
		
		for(int i=0; i<this.immobiliers.size(); i++) {
			if (this.immobiliers.get(i).getType().equals("Studio"))
				this.immobiliers.get(i).baisserPrix(500);
				this.promotions.add(this.immobiliers.get(i));
		}
	}
	 
	 
	
}

// Calculer le nombre d'immobilier pour chaque type(maison, pavillon etc)
