public class Summe {
	public static void main (String[]args) {
	
		double sum = 0;
 for (double i=2; i<=30; i++) {
 
 sum+= 1/(i*i);
 System.out.println (sum + "+=1/" + i +"^2");
 
 }
 
 System.out.println("\n Summe: "+sum);
 }
 }