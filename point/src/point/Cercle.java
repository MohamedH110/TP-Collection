package point;

public class Cercle {

		double rayon;
		Point centre;
		
		Cercle(Point x,double r){
		this.centre=x;
		this.rayon=r;
		}
		void afficher() {
			System.out.println("cercle de centre: "+centre+"et de rayon="+rayon);
			
			
		}
      
	
      void deplacer(int a, int b) {
    	  this.centre.abs+=a;
    	  this.centre.ord+=b;
      }
     boolean coincide(Cercle c1,Cercle c2) {
    	 return (c1.centre.ord==c2.centre.ord)&&
    			(c1.centre.abs==c2.centre.abs)&&
    			(c1.rayon==c2.rayon);
     }


}



