package td;

public class livre2 {
	private String titre;
	private String auteur;
	int nbPages;
	
	

	public String getAuteur() {
		return auteur;
	}
	public String gettitre() {
		return titre;
	}

    public int getnbpage() {
	   return nbPages;
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
	 
	public String toString() {
		return "livre titule "+titre +" de "+auteur +" contenant "+nbPages+"page";
	}

    public livre2 (){
    	nbPages=0;
    	}

    public livre2 (String  titre,int nbpages) {
    	this.titre =titre;
    	this.nbPages = nbpages;}



    public livre2(String auteur,String titre,int nbpages) {
    	this.auteur=auteur;
    	this.titre=titre;
    	this.nbPages=nbpages;
    }
    
    
    
    
}


