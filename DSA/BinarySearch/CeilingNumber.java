package DSA.BinarySearch;

public class CeilingNumber {
    static int ceiling(int[] arr , int target){
        // If target is greater than the largest element,
        // then no ceiling exists.
        if (target > arr[arr.length - 1]) {
            return -1; // No ceiling exists
        }
        int s = 0;
        int e = arr.length - 1;
        
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return arr[s];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = ceiling(arr , 15);
        System.out.println(ans);
    }
}
