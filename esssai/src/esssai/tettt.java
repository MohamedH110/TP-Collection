package esssai;
import java.util.Scanner;

public class tettt {
public static void main(String args[]) {
Scanner sc= new Scanner(System.in);


System.out.println("Quel est votre prenom ? ");

String prenom = sc.nextLine();
affiche (prenom);

System.out.println("Quel est votre age ? ");

int age = sc.nextInt();

System.out.println("\nBienvenu " + prenom + " !");

System.out.println("\nvous avez " + age + " !");



System.out.println("entrer un prix");
int prix=sc.nextInt();
int p =prix-prix*20/100;
System.out.println("nouveau prix="+p);



}
public static void affiche(String prenom) {
	System.out.println(prenom);
};
}

