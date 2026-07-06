package DSA.LinearSearch;

public class Searching1 {
    static int searchTarget(int[] arr, int target, int start, int end){
        for(int i = start; i <= end; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(searchTarget(arr, 14, 1, 4));
    }
}
