package tdd3;

public class motdico {
   private int num;
   private static int count;
   private String mot;
   private String definition;
   
   public motdico(String mot, String definition) {
       this.num = count;
       this.mot = mot;
       this.definition = definition;
       count++;
   }
   
   
   String getMot () {
	   return this.mot;
   }
	
   String getDéfinition () {
	   return this.definition;
   }
   
   
   void setDéfintion (String s) {
	   this.definition=s;
   }
   
   void setMot (String s) {
	   this.mot=s;
   }
   
   boolean synonyme (motdico m) {
	   if (m.mot==this.mot) {
		   return true;
	   }
	   else return false;
   }
   
}
