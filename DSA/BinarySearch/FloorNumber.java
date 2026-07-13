package DSA.BinarySearch;

public class FloorNumber {
    static int floorNum(int[] nums, int target){
        if(target < nums[0])
            return -1; // No floor number exist in this Array

        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(target == nums[mid])
                return nums[mid];

            else if(target > nums[mid]){
                s = mid + 1;
            }
            else
                e = mid - 1;

        }
        return nums[e];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,18};
        int ans = floorNum(arr,1);
        System.out.println(ans);
    }
}
