package tutoClasses;

public class Immobilier {

	private int prix;
	private String peinture;
	private String type;
	private Agence agence;
	private boolean promotion;
	
	
	public Immobilier(int prix, String peinture, Agence agence, String type) { 
        this.prix=prix;
        this.peinture=peinture;
        this.type=type;
        this.agence = agence;    
        this.promotion = false;
    }
	 
	public Immobilier() {
		
	}
	
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public String getPeinture() {
		return peinture;
	}
	
	public void setPeinture(String peinture) {
		this.peinture = peinture;
	}
	

    public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public void augmenterPrix(int augmentation) {
        this.prix+=augmentation;
    }
	
	public void baisserPrix(int baisse) {
		this.prix-=baisse;
	}
	
	
    
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	public boolean isPromotion() {
		return promotion;
	}

	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
	}

	public void changerPeinture(String nvelle_peinture) {
        this.peinture=nvelle_peinture;
    } 
    
    public void addAgence(Agence agence) {
    	this.agence=agence;
    }
    
    
    
    
     
    
    
}
