
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for(int i=0; i<nums.length; ++i) {
            nums[i]=(int)Math.random()*11;
        }
    }
}