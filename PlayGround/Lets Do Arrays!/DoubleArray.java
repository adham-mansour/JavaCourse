public class DoubleArray {

    public static void main(String[] args) {
        double[][] data = new double[100][100];
        initArray(data);  // Methode zur Initialisierung aufrufen
    // Durchschnittswert für alle Zeilen
    for(int i=0; i<data.length; i++=) {
        System.out.format("Zeilennr. %d Durchschn: %.2f\n", i, calcRowAverage(data, i));

    }
    
    
    }


    // Methode, um das Array zu initialisieren
    public static void initArray(double [][] p) {
        var rnd = new java.util.Random();
        // Schleife über alle Zeilen
        for(int row=0; row < p.length; row++) {
            // in jd. Zeile: Schleife auf alle Elemente
            for(int col=0; col < p[0].length; col++) {
                p[row][col] = rnd.nextDouble() * 100;
            }
        }
    }
        //Methode, um Durschnittswert einer Zeile auszurechnen
        public static double calcRowAverage(double [][] data, int rownr) {
            double sum = 0,0;
            for(int i=0; i<data[rownr].length; i++) {
                sum += data[rownr] [i];
            }
            return sum / data[rownr].length;
    }
}
