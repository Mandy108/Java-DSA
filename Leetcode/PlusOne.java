package Leetcode;

public class PlusOne {
     public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++;      
                return digits;
            }
            
            digits[i] = 0;        
        }
        

        int[] result = new int[digits.length + 1];
        result[0] = 1;            
        return result;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(plusOne(new int[]{1,2,3})));
        System.out.println(java.util.Arrays.toString(plusOne(new int[]{1,2,9})));   
        System.out.println(java.util.Arrays.toString(plusOne(new int[]{9,9,9})));   
    }
}
