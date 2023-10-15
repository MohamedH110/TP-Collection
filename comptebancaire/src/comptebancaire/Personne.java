package comptebancaire;

public class Personne {
	
		private String nom;
		private String prenom;
		private String adresse;
		
		
		Personne (String nom,String prenom,String adresse){
			this.nom=nom;
			this.prenom=prenom;
			this.adresse=adresse;
		}
		 
		 void setnom(String n) {
			 nom=n;
		}
		 String getnom() {
			return nom;
		}
		void setprenom(String pr) {
			 prenom=pr;
		}
		 String getprenom() {
			return prenom;
		}
		 void setadresse(String s) {
			 adresse=s;
		}
		 String getadresse() {
			return adresse;
		}
		 public String toString() {
				return nom+prenom+adresse;
			}
	}
	


