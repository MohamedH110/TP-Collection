package point;

public class TestPoint {

	public static void main(String[] args) {						      			       
			        Point p1 = new Point(5, 6, 'A');
			        Point p2 = new Point(p1);
			        Point p3=new Point();
			        p1.affiche();
			      
			       
	               Cercle c1=new Cercle(p1,10);
	               Cercle c2=new Cercle(p2,12.5);
	               System.out.println(c1.rayon+""+c1.centre);
	               c1.afficher();
	               c1.deplacer(3,5);
	               c1.afficher();
	               System.out.println(c1.coincide(c1,c2));
	               System.out.println(c1.centre.toString());
	               System.out.println(c1.centre.coincideV2(c1.centre,c2.centre));
	
	}
			
              
	}


