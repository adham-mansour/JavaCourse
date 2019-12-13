public class Main {
    public static void main(String[] args) {
        String ilovejava = "Ich liebe Java so sehr!";
        char[][] myarray = createCharArray(ilovejava);
        //Testausgabe: Schleife über alle Zeilen, jede Zeile mit java.util.Arrays.toString in eine Zeichenkette
        //umwandeln und ausgeben
        for(int row=0; row<myarray.length;row++)
            System.out.println( java.util.Arrays.toString( myarray[row]));
    }

    //erzeugt ein quad. Array, verteilt die Zeihen von 
    //s über die Elemente des Arrays, füllt die übrigen
    //Elemente mit Leerzeichen
    public static char [][] createCharArray(String s) {

        //Seitenlänge des Quadrats
        int n = (int)Math.sqrt (s.length() ) +1;

        //Array erzeugen
        char[][] result = new char[n][n];

        //Array mit Daten füllen
        for(int row=0; row<n; row++) {
            for(int col=0; col<n; col++) {
                if(s.length()<pos) {
                result[row][col] = s.charAt(pos);
                }else{
                result[row][col] = '';

                }
                pos++;
            }
        }

        // Ergebnis zurückgeben
        return result;
    }
}