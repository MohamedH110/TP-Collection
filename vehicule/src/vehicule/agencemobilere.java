package vehicule;

public class agencemobilere {
     int max;
     int nb;
      private vehicule[] tab;
     
      agencemobilere(int max) {
		this.max=max;  
    	tab=new vehicule[max];
		  
	}

    
    
    
    void ajoutvehicule(vehicule v) {
    	if (nb<max) {
    		tab[nb]=v;
    		nb++;
    	
    	}
    	else {System.out.println("pas de place dans le tableau");}
    	
    }

   
    void selection(int n) {
    	if (n<nb && n>=0) {
    		System.out.println(tab[n].decrisvehicule());
    	}
    	else {System.out.println("vehicule n existe pas");}
    }



    
    int getnb() {
    	return this.nb;
    }
    
    
    
    void selection(String mq) {
    	int a=0;
    	for (int i=0;i<nb;i++) {
    		if(tab[i].getmarque()==mq) {
    			System.out.println(tab[i].decrisvehicule());
    			a++;
    		}
    	}if (a==0) {
    		System.out.println("marque n existe pas");
    	}
    	
    }
    
    
    
    void selection(Double px) {
      
    	int a=0;
    	for (int i=0;i<nb;i++) {
    		if(tab[i].getprix()<px) {
    			System.out.println(tab[i].decrisvehicule());
    			a++;
    		}
    		
    	}
    	
    	if (a==0) {System.out.println("il n’y a pas de véhicules dans cette marge de prix"+px);}
    }    
    
    
    
    
    
    void ancien() {
    	//int ind=0;
    	//int min=tab[0].getannee();
    	vehicule vAncien=tab[0];
    	for (int i=1;i<nb;i++) {
    		if (tab[i].getannee()< vAncien.getannee()) {
    			vAncien=tab[i];
    		//	min=tab[i].getannee();
    		//	ind=i;
    		}
    	}
    	System.out.println("la voiture la plus ancienne est"+vAncien.decrisvehicule());
    }
    
    
    
 public static void main(String[] args) {
	vehicule v = new vehicule("Clio","Classique",2000 ,20.000);
	vehicule w = new vehicule("Mercedes","Fantôme", 2008 ,60.000);
	vehicule x = new vehicule("KIA","Picanto",2012,35.000);
	
	
	System.out.println(v.decrisvehicule());
	System.out.println(w.decrisvehicule());
	System.out.println(x.decrisvehicule());
	
	System.out.println("\n");
	agencemobilere ag=new agencemobilere(5);
	ag.ajoutvehicule(v);
	ag.ajoutvehicule(w);
	ag.ajoutvehicule(x);

	
	ag.selection("Mercedes");
	System.out.println("\n");
	ag.selection(40.000);
	System.out.println("\n");
	ag.ancien();
	
}



}
