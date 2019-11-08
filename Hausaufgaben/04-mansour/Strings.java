/**
 * Strings
 */
public class Strings {
    public static void main(String[] args) {
        String s = "Java is an object-oriented Programming language and a registered trademark of Company Sun Microsystems, which was launched in 2010 by Oracle was bought.";
        System.out.println("There are this many characters: " +s.length());
        
        int count = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                count = count +1;
            } 
        }

        System.out.println("There are this many spaces: " +count);

        boolean thisisacomma = false;

        count = 0;

        while(!thisisacomma){
            char ch = s.charAt(count);
            if(ch == ','){
                thisisacomma = true;
            }
            else{ 
                count++;
            }
        }
        
        System.out.println("The first comma appears at " +count);

        String caps = "";

        for(int i = 0; i<s.length(); i++) {
            
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) {
                caps = caps + ch;
            }
        }
        
        System.out.println("These are the upper-case characters :" + caps);
    }
}