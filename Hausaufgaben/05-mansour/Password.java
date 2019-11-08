/**
 * Password
 */

import java.util.Random;

public class Password {

    public static void main(String[] args) {
        int n = 10;
        Random r = new Random();
        String specialCharacters = "!$%&/()=,;.:-_.";
        String password = "";

        char upper = (char)(r.nextInt(26)+65); // GENERATES A CHAR BETWEEN A - Z
        char special = specialCharacters.charAt(r.nextInt(specialCharacters.length())); //GENERATES A CHAR FROM THE SPECIAL CHARACTERS STRING
        int numeral  = r.nextInt(10);

        boolean addedNumber = false;
        boolean addedSpecial = false;
        boolean addedUpper = false;

        int count = 3;
        
        for(int i = 0 ;  count != 0 || i < n-3 ;){
            if(r.nextInt(2) == 1){ // FLIP A COIN TO CHOOSE RANDOMLY WHAT TO INSERT NEXT

                if( count != 0 ){ // insert one of the three main required charactesr
                    int flip = r.nextInt(3)+1;

                    if( flip == 1 && !addedNumber){
                        addedNumber = true;
                        password += numeral;
                        count--;
                    }
                    if( flip == 2 && !addedSpecial){
                        addedSpecial = true;
                        password += special;
                        count--;
                    }
                    if( flip == 3 && !addedUpper){
                        addedUpper = true;
                        password += upper;
                        count--;
                    }
                }
            }
            else{
                if(i < n-3){//insert normal letters
                    char tmp = (char)(r.nextInt(26)+97); // GENERATES A CHAR BETWEEN a - z
                    password += tmp;
                    i++;
                }
            }
        }

        System.out.println(password);
    }
}