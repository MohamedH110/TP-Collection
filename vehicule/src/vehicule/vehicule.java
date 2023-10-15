package vehicule;

public class vehicule {
private int numero;
private String marque;
private String modele;
private int annee;
private double prix;

static int count;

vehicule (String marque, String modèle, int année, double prix){
	count++;
	this.marque=marque;
	this.modele=modèle;
	this.annee=année;
	this.prix=prix;
}
	
	
	 public String decrisvehicule() {
		return "marque:"+marque+" modele:"+modele+" annee:"+annee+"prix:"+prix;
	} 
	
	
	 String getmodele() {
		return this.modele;
	}
	
	 String getmarque() {
		return this.marque;
	}
	
	 double getprix() {
		return this.prix;
	}
	
	 int getannee() {
	    	return this.annee;
	    }
	 void setmarque(String marque) {
		this.marque=marque;
	}
	
	 void setmodele(String modele) {
		this.modele=modele;
	}
	 void setprix(double prix) {
		this.prix=prix;
	}
	
    int getcount() {
    	return count;
    }

    int getanneet() {
    	return annee;
    }
    
    

}

