/**
 * CREATE AN ARRAY OF RANDOMIZED NUMBERS [range between 0 - 10] CREATE ANOTHER
 * ARRAY OF RANDOMIZED NUMBERS [range between 0 - 15] SUM ALL SIMILAR NUMBER
 * THE SIZE OF THE ARRAYS IS DECIDED BY THE USER.
 */

import java.util.Scanner;
import java.util.Random;

public class arrays {
    public static void main(String[] args) {
        System.out.println("Put your preferred number here.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        //System.out.println(num);
        int[] array1 = new int[num];
        int[] array2 = new int[num];       
        
        Random rand = new Random();
        
        int i = 0;                                          // Initialize Counter/Indexer
        while( i < num ){                                   // The condition of the loop
            array1[i] =  rand.nextInt(11);
            array2[i] = rand.nextInt(16);

            i++;                                            // increment of the counter/indexer
        }

        //FOR STRUCTURE
        //for(Initilize counter/Indexer ; condition of loop ; increment the counter/indexer)

        // EXAMPLE OF THE WHILE ABOVE BUT IN FOR.
        // for(int i=0; i<num; i++){
        //     array1[i] =  rand.nextInt(11);
        //     array2[i] = rand.nextInt(16);
        // }


        int abc = 0;
        
        for(i = 0 ; i < num; i++){

            if(array1[i] == array2[i]){                   // Check if Array1 in place i is equal to Array2 in place i
                abc++;                                    // if it is equal add 1 to the abc variable which in term will cause it to count how many times we were equal.
            }
            
        }

        System.out.println(abc+"'s Arrays Similar in places");



         /** EXAMPLE HOW TO FILL AN ARRAY WITH NUMBERS + DRY RUN 
         *   1   2   3  4  5  
         * [ []  []  []  [] [] ]
         *   0   1   2   3  4 
         * 
         * int[] a;
         * a = new int[5];
         * 
         * for(int i  = 0 ; i < a.length ; i++)
         * {
         *   // WE ARE GOING OVER ALLL THE ELEMENTS IN THE ARRAY
         *  a[i] = i;
         * }
         * 
         * a[0] = 0;
         * a[1] = 1;
         * 
         * [ [0]  [1]  [2]  [3] [4] ]
         *   0   1   2   3  4 
         * 
         * i    a.length    i < a.length    
         * 0    5           True            DO LINE OF CODE a[0] = 0;
         * 1    5           True            DO LINE OF CODE a[1] = 1;
         * 2    5           True
         * 3    5           True    
         * 4    5           True            a[4] = 4;
         * 5    5           False           DONE WITH THE LOOP
         */
    }
}