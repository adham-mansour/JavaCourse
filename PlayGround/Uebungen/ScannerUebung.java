import java.util.Scanner;

public class ScannerUebung {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        double r = inputRadius(scan);
        System.out.format("Flächeninhalt: %.f\n" + area(r));
        System.out.format("Umfang: %.f\n" + perimeter(r));



    }
    // Methode, um einen Radius einzugeben 
     static double inputRadius(Scanner sc) {
        System.out.print("Bitte geben Sie den Radius ein: ");
        double radius = sc.nextDouble();
        return radius;
        

     }
     // Methode, um den Flächeninhalt auszurechnen
     static double area(double r) {
         double area = r * r * Math.PI;

         // Methode, um den Umfang auszurechnen
     static double perimeter(double r) {
        return 2 * r * Math.PI;
       

     }
}

