package DSA.LinearSearch;

public class Main {
    static int Lsearch1(int[] arr , int target){
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == target){
        //         return i;
        //     }
        // }
        // return -1;

        // We can not find index on the enhanced for loop
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for(int i : arr){
            if(i == target){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(StringSearch[] args) {
        int[] arr = {12, 22, 24, 45, 55, 32, 14};
        System.out.println(Lsearch1(arr, 15));
    }
}
