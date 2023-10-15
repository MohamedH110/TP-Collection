package td;

public class livre3 {
	private String titre;
	private String auteur;
	int nbPages;
	double prix;
	boolean prixfixe=false;
	
	public String getAuteur() {
		return auteur;
	}
	public String gettitre() {
		return titre;
	}

    public int getnbpage() {
	   return nbPages;
   }
    
    public double getprix() {
    	return prix;
    }
	
	 void setauteur(String auteur) {
		this.auteur=auteur;
	}
	 void settitre(String titre) {
		this.titre=titre;
	}
	
	 void setnbpages (int nbPages) {
		if (nbPages > 20) {
		this.nbPages = nbPages;
	}
		else {System.out.println("le nombre de page est faible");}
	}
	 
	
	 void setprix(double prix) {
		 if(testprix(prix)==false) {
		 this.prix=prix;
		prixfixe=true;
	}else  {System.out.println("on ne peut pas changer le prix");}}
	 
	 public livre3(String auteur,String titre,int nbpages,double prix) {
	    	this.auteur=auteur;
	    	this.titre=titre;
	    	this.nbPages=nbpages;
	    	
	    	setprix(prix);
	    	
	    	
	 }
	 
	 
	 
	 boolean testprix(double prix) {
	   if (prixfixe == true ) {return true;}
	   else return false;
   }
   

	 public String toString() {
			return "livre titule "+titre +" de "+auteur +" contenant "+nbPages+"page";
		}




}
