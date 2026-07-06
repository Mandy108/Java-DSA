package DSA.Array;
import java.util.*;
public class RevArr {
    static void ReverseArr(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,6,9};
        ReverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
