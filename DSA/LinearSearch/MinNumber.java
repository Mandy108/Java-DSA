package DSA.LinearSearch;

public class MinNumber {
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 12, 13, 15, 1, 22, 23, 35};
        System.out.println(min(arr));
    }
}
