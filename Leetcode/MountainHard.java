package Leetcode;

public class MountainHard {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
            MountaiArray mountainArray ={1,2,3,4,5,3,1};
            int ans =  findInMountainArray(3, mountainArray);
            System.out.println(ans);
    }
}
