package DSA.Array;
import java.util.*;
public class PassingInFunction {
    static void change(int[] arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int[] nums = {22,33,44,55};
        System.out.println(Arrays.toString(nums));

        change(nums);
        // print changed Arrays
        System.out.println(Arrays.toString(nums));

    }
}
