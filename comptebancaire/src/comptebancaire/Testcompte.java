package comptebancaire;

public class Testcompte {
	
	 public static  void soldeeleve(Comptebancaire[] tab) {
     	double max =tab[0].getsolde();
         int ind=0;
	       for (int i=0;i<tab.length;i++) {
	    	   if (tab[i].getsolde() > max) {
	    		   ind=i;
	    		   max=tab[i].getsolde();
	    		   
	    	   }
	    	  
	       }
	       System.out.println("la personne vec le solde le lpus eleve est"+tab[ind]);
		
	}
	
	
	public static void main(String[] args) {
		Comptebancaire[]tab=new Comptebancaire[4];
		
		
		Personne p1 =new Personne("moh","med","oo");
		Personne p2=new Personne("sa","leh","kk");
		Personne p3 =new Personne("ali","gg","dd");
		Personne p4 =new Personne("ibr","ahim","ee");
		
		
		tab[0]=new Comptebancaire(p1,1000,500,600);
		tab[1]=new Comptebancaire(p2);
		tab[2]=new Comptebancaire(p3,900,500,600);
		tab[3]=new Comptebancaire(p4,10000,500,600);
		
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		
		tab[0].virement(400,tab[1]);
		tab[0].virement(tab[0],tab[1],100);
		tab[0].crediter(800);
		tab[0].debiter(200);
		tab[0].retrait(300);
		
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        
	
	     soldeeleve(tab);
	
	}
       
        
     
	       
      
}

