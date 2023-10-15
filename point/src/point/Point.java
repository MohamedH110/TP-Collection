package point;

public class Point {
	
	    char nom;
	    int abs;
	    int ord;

	    Point(int abscisse, int ordonnee, char nom) {
	        this.nom = nom;
	        abs = abscisse;
	        ord = ordonnee;
	    }
       
	    Point (){
	    	abs=0;
	    	ord=0;
	    	nom='o';
	    }
	    Point(Point p){
	    	abs=p.abs;
	    	ord=p.ord;
	    	nom=p.nom;
	    }
	    
	    
	    void affiche() {
	        System.out.println("Point " + nom + " abs:" + abs + " ord:" + ord);
	    }

	    void deplacer(int x, int y) {
	        abs = abs + x;
	        ord = ord + y;
	    }



	    void reset(){
	          abs =0;
	          ord=0;
	    }

	    
	    
	    public String toString() {
	        return nom + "(" + abs + ", " + ord + ")";
	    }
	    
	     boolean coincideV1(Point p) {
	    	return (p.abs==this.abs)&&(this.ord==p.ord);
	    	
	    	
	    }
	     
	     boolean coincideV2(Point a, Point b) {
	    	 return(a.abs==b.abs)&&(a.ord==b.ord);
	     }
	     public static void main(String[] args) {						      			       
		        Point p1 = new Point(5, 6, 'A');
		        p1.affiche();
		        p1.deplacer(5,4);
		        Point p2 = new Point(p1);
		        Point p3=new Point();
		        
		        p1.affiche();
      }
	     }

	


	


