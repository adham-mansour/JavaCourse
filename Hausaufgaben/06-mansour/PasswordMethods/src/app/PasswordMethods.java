package app;

import java.util.*;

public class PasswordMethods {

     /**
      * Method1 Receives NONE Returns a new password containing 7 random small
      * letters
      */
     public static String addrandomSmallletter() {

          String klein = "abcdefghijklmnopqrstuvwxyz";
          String pw = "";
          Random r = new Random();

          int n = 10;
          for (int i = 0; i < n - 3; i++) {
               pw += klein.charAt(r.nextInt(klein.length()));
          }
          return pw;
     }

     /**
      * Method2 Receives a password Returns a new password containing extra number,
      * capital letter, special character
      */
     public static String addMiscCharacters(String pw) {
          String gross = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
          String ziffern = "0123456789";
          String zeichen = ",;.:-#+*!$%&()=";

          Random r = new Random();

          int pos;
          // analog for Capital letter
          pos = r.nextInt(pw.length() + 1);
          pw = pw.substring(0, pos) + gross.charAt(r.nextInt(gross.length())) + pw.substring(pos);

          // analog for number
          pos = r.nextInt(pw.length() + 1);
          pw = pw.substring(0, pos) + ziffern.charAt(r.nextInt(ziffern.length())) + pw.substring(pos);

          // analog for special sign
          pos = r.nextInt(pw.length() + 1);
          pw = pw.substring(0, pos) + zeichen.charAt(r.nextInt(zeichen.length())) + pw.substring(pos);

          return pw;
     }

     public static void main(String[] args) {

          String pw = PasswordMethods.addrandomSmallletter();
          pw = PasswordMethods.addMiscCharacters(pw);

          System.out.println(pw);
     }
}
