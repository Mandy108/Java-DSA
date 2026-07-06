package DSA.Array;
import java.util.*;
public class Input {
    static void inp(){
        Scanner in = new Scanner(System.in);
        //Array of Premitive"
        // int[] arr = new int[5];
        // arr[0] = 2;
        // arr[1] =32;
        // arr[2] = 3;
        // arr[3] = 42;
        // arr[4] = 544;
        // System.out.println(arr[3]);
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = in.nextInt();
        // }
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // for(int num : arr){
        //     System.out.print(num + " ");
        // }
        //Arrey of Object
        String[] str = new String[5];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
            System.out.print(Arrays.toString(str));
        
        // for(String val : str) {
        //     System.out.println(Arrays.toString(str));
        // }

    }
    public static void main(String[] args) {
        inp();
    }
}
