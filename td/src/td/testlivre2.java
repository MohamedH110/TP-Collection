package td;

public class testlivre2 {
	
	
	


	public static void main(String[] args) {
		livre2[] tab =new livre2[3];
		livre2 l1=new livre2("Coelho","L'alchimiste",225);
		livre2 l2=new livre2("Le Coran",508);
		livre2 l3=new livre2();
		
		
		l3.settitre("Harry Potter");
		l3.setauteur("JK Rowling");
		l1.setauteur("Paulo Coelho");
		l3.setnbpages(461);
		tab[0]=l1;
		tab[1]=l2;
		tab[2]=l3;
		for(int i=0;i<tab.length;i++) {
			System.out.println ( tab[i]);
		}

	}

}
