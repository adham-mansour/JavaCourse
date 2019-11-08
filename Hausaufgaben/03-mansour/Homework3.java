
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        int i = 0;
        int numbers[] = new int[50];
        Random rand = new Random();

        for( i = 0; i < numbers.length; ++i){
            numbers[i] = rand.nextInt(11);
        }

        int sum = 0;
        int zero = 0;
        int seven = -1;
        boolean found = false;

        i = 0;

        while(i < numbers.length){
            if(numbers[i] == 7 && !found){
                seven = i;
                found = true;
            }

            if(numbers[i] == 0){
                ++zero;
            }

            sum += numbers[i];

            ++i;
        }

        ++seven;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Count of zeros: " + zero);
        if(!found)
            System.out.println("We did not find the number 7");
        else
            System.out.println("Number 7 found in the "+seven+" place!");
    }
}