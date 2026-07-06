package DSA.Array;
import java.util.*;
public class SwapArr {
    static void swap(int index1, int index2){
        int[] arr = {1,2,5,6,7};
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        swap(1, 4);
    }
}
