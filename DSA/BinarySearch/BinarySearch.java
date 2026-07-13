package DSA.BinarySearch;

public class BinarySearch {

    // Return the Index
    // Return -1 if doesn't exist
    static int Bsearch(int[] nums, int target){
        int start = 0 ;
        int end = nums.length-1;
        
        while(start <= end){
            // find the middle element
    //        int mid = (start + end) / 2;   // Might be possible where (start + end) exceed the range of integer limit in java
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else 
                return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,9,10,12,14,18,19};
        System.out.println(Bsearch(nums,2));
    }
}
