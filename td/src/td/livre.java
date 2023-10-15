package td;

public class livre {
	private String titre;
	private String auteur;
	int nbPages;
	
	public livre (String auteur,String  titre) {
	this.auteur =auteur;
	this.titre = titre;}

	public String getAuteur() {
		return auteur;
	}

	public void setNbPages (int nb) {
		nbPages = nb;}
	
	  boolean memeauteur(livre s1,livre s2) {
		if (s1.getAuteur()==s2.getAuteur()) {
			return true;
			
		}
		else return false;
	} 
}
