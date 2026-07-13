package Leetcode;

public class EvenDigit {
    static int findNumbers(int[] nums){
        int count = 0;
         
        // for (int i = 0; i < nums.length; i++) {
        //     if (even(nums[i])) {
        //         count++;
        //     }
        // }
        
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // Function to check whether a number is even digits or not
    static boolean even(int num){
        int NumsofDigit = digits(num);
        /*
        if(NumsofDigit % 2 == 0){
        return true;
        }
        return false;
        */
        return NumsofDigit % 2 == 0;
    }
    // Count numbers of a digit in a number
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
