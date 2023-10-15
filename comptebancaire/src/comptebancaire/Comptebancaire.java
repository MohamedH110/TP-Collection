package comptebancaire;

public class Comptebancaire {
	private static  int count;
	private int numcompte;
	private double solde;
	private Personne titulaire;
	int decouvertmax;
	int debitmax;
	
	
	Comptebancaire(Personne p){
		titulaire =p;
		count++;
		numcompte=count;
		decouvertmax=800;
		debitmax=1000;
		solde=0;
	}
	
	
	
	
	Comptebancaire(Personne p,double s,int decomx,int debmx){
		titulaire=p;
		count++;
		numcompte=count;
		solde=s;
		decouvertmax=decomx;
		debitmax=debmx;
		
		
		}
	
	
	public void setsolde(double sol) {
		this.solde=sol;
	}
	
	
	double getsolde() {
		return this.solde;
	}
	
	
	
	
	public void crediter(double sol) {
		if (sol>=0) {
		     solde=solde+sol;}
		else 
			System.out.println("ajouter un solde positif");
	}
	
	
	  void debiter( double sol) {
		
			if (solde-sol<-decouvertmax) {
				System.out.println("operation annule");
			}else solde=solde-sol;
	}
		
	  
	  
	  
	  
void retrait (double sol) {
		if (sol <solde) {
			debiter(sol);
		}
		else {System.out.println("error");}
	}
	
	
	
	public String toString() {
		return "num= "+numcompte +" solde="+solde+" "+titulaire;
	}
	
	
	boolean estadecouvert() {
	   
		if (solde <0) {
		   return true;
	   }
	   else 
		   return false;
	}
	
	
	double montantdecouvert() {
		if (this.estadecouvert()==true) {
			return Math.abs(solde);
		}
		else return 0;
	}
	 
	
	void virement(double montant,Comptebancaire c) {
		if (this.solde>montant) {
			c.solde=c.solde+montant;
			this.solde-=montant;
		}
		else {
			System.out.println("operation a echoe");
		}
	}
	
	
	void virement(Comptebancaire c1,Comptebancaire c2,double montant ) {
		if (montant <c1.solde) {
			c2.solde+=montant;
			c1.solde-=montant;
		}
		else {System.out.println("operation a echoue");}
	}
	
	
	

}
