package tdd3;

public class calculmoyenne {

	public static void main(String [] args) {

    float[] notectrl=new float[tab.nmax];
    float[] noteexam=new float[tab.nmax];
    float[] moy=new float[tab.nmax];
    
     tab.remplir(notectrl);
     tab.remplir(noteexam);
	  tab.addionnernote((float)1.5,notectrl);
	  tab.addionnernote((float)1.5,noteexam);
     moy=tab.additionner(notectrl,tab.produit(2,noteexam));
     tab.deviser(moy);
     
     
     
     tab.lister(moy);
     System.out.println(tab.moyclasse(moy));
     



}
	
	
	

	
	
}
	
	
	