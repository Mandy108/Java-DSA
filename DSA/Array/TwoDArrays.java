package DSA.Array;
import java.util.*;
public class TwoDArrays {
    static void IpOp(){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[6][4];
        // int[][] arr ={
        //              {1,2,3},   // 0th index
        //              {4,5},     // 1st index
        //              {7,8,9}    // 2nd index
        // };


        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
            arr[row][col]=in.nextInt();  // Taking input for the 2DArrays
            }
        }

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
            System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        IpOp();
    }
}
