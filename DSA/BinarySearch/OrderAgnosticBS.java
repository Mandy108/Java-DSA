package DSA.BinarySearch;

public class OrderAgnosticBS {
    static int oabs(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        // check where array is ascending or descending order
        boolean isAsc = arr[s] < arr[e];
        while(s <= e){
            int mid = s + (e - s) / 2;
        
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    e = mid-1;
                }else
                    s = mid + 1;
            }
            else{
                if(target > arr[mid]){
                    e = mid - 1;
                }
                else
                    s = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {12,15,22,24,27,29,35,37,38,99,108,1008,1111};
        System.out.println(oabs(nums,27));
    }
}
