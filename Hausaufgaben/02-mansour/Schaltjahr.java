import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        int year;
        int month;

        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter the Year:");
        year = s.nextInt();
        System.out.println("Please Enter the Month:");
        month = s.nextInt();

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days");
        } else {
            if (month == 2) {
                if (year % 4 == 0 || year % 400 == 0) {
                    System.out.println("29 Days - It's a leapyear!");
                } else {
                    System.out.println("28 Days");
                }
            } else {
                System.out.println("31 Days");
            }
        }
    }
}