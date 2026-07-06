package DSA.LinearSearch;
import java.util.*;
public class SearchIn2DArray {
    static int[] search(int[][] nums, int target){
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[row].length; col++){
                if(nums[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {12,55,64,77},
            {77,63,909,998,225}
        };
        int[] ans = search(arr , 9);
        System.out.println(Arrays.toString(ans));
    }
}
