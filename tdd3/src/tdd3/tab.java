package tdd3;

import java.util.Scanner;

public class tab {
	
	static  int nmax=40;
	static  int nb;
	
    static void remplir(float[] t) {
    	Scanner sc = new Scanner(System.in); 
    	System.out.println("Saisissez la taille du tableau");
          nb= sc.nextInt();
    
        if (nb > nmax && nb<=0) {
            System.out.println("nb doit etre positif et < nmax ");}
            
        else {
        for (int i = 0; i < nb; i++) {
            System.out.print("entrer une valeure" + i);
            t[i] = sc.nextFloat();
        }
    }
    }
  
   static  float sommeelement(float p[]) {
	   float s=0;
	   for (int i=0;i<p.length;i++){
		   s=s+p[i];
	   }return s;
   }
   
   
   static float[] additionner(float t1[], float t2[]) {
	    float[] resu = new float[nb];
	    for (int i = 0; i < nb; i++) {
	        resu[i] = t1[i] + t2[i];
	    }
	    return resu;
	}

 static void deviser(float[] t) {
	for(int i=0;i<nb;i++) {
		t[i]=t[i]/3;
	}
}
   
   
   
   static float moyclasse(float[] t) {
	   return sommeelement(t)/nb;
   }
   

static float[] produit(float x,float l[]) {
	float[] resu=new float[nb];
	for(int i=0;i<nb;i++) {
		resu[i]=l[i]*x;
	}return resu;
}



static void lister (float k[]) {
	for(int i=0;i<nb;i++) {
		System.out.println(k[i]);
	}
}



static  float [] addionnernote(float x,float[] t) {
	for (int i=0;i<nb;i++) {
		t[i]=t[i]+x;
	}return t;
}


}