package tdd3;

public class dictionnaire {
  private int nbmots;
  private motdico[] dico;
  private String nom;
  
       dictionnaire(String nom) {
	       dico=new motdico[10];
	       this.nom=nom;
      }
       
       public void ajoutermot(motdico m) {
           if (nbmots < dico.length) {
               dico[nbmots] = m;
               nbmots++;
           } else {
               System.out.println("dictionnaire plein");
           }
       }
       
      public void supprimerMot (String ch) {
    	  for (int i=0;i<nbmots;i++) {
    		  if(ch==dico[i].getMot()) {
    			  dico[i].setMot("");
    			  dico[i].setD�fintion("");
    			  nbmots--;
    		  }
    	  }
      }
      
      
      public int chercherMot (String ch) {
    	  int a=-1;
    	  for (int i=0;i<nbmots;i++) {
    		  if(ch==dico[i].getMot()) 
    		  { a=i;}
    		  }
    	  return a;}
    	 
      
   public  void listerDico () {
	   for(int i=0;i<nbmots;i++) {
		   System.out.println(dico[i].getMot());
	   }
   }
   
   
   
   
   public int nbSynonymes (motdico m) {
	   int a=0;
	   for (int i=0;i<nbmots;i++) {
		   if (dico[i].synonyme(m)) {
			   a++;
		   }
	   }return a;
   }
   
   
   public void affichemot(int i) {
	   if(i<0) {System.out.println("mot n existe pas");}
	   else {
	   System.out.println(dico[i].getMot()+" "+dico[i].getD�finition());
   }
	   }

 
   
   
   public static void main (String[] args) {
	 
	 dictionnaire d1=new dictionnaire("Larousse");
	 motdico m1=new motdico("mohamed","qwerty");
	 motdico m2=new motdico("mohamed","qwerty");
	 motdico m3=new motdico("hamrouni","azerty");
	 motdico m4=new motdico("dsi22","isetn");
	 
	 d1.ajoutermot(m1);
	
	 d1.ajoutermot(m3);
	 d1.ajoutermot(m4);
	 d1.ajoutermot(m2);
	 
	 
	 d1.listerDico();
	 System.out.println(d1.chercherMot("aaaa"));
	 d1.affichemot(d1.chercherMot("dsi22"));
	 
 
	 System.out.println("le nb de synonyme = "+d1.nbSynonymes(m1));
   
   d1.supprimerMot("mohamed");
   d1.listerDico();
   
   
   }



}







