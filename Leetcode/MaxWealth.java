package Leetcode;

public class MaxWealth {
    static int maximumWealth(int[][] accounts) {
        // int max = 0;

        // for (int row = 0; row < accounts.length; row++) {
        //     int currentWealth = 0;

        //     for (int col = 0; col < accounts[row].length; col++) {
        //         currentWealth += accounts[row][col];
        //     }
        //     if (currentWealth > max) {
        //         max = currentWealth;
        //     }
        // }


        // using Enhanced for loop
       int ans = Integer.MIN_VALUE;
        for(int[] ints : accounts){
            int sum = 0;
            // When you start a new col, take a new sum for that row
            for(int anInt : ints){
                sum += anInt;
            }
            // Now we have sum of accounts of person
            // Check with overall ans
            if(sum > ans){
             ans = sum;
            }
        } 
        return ans;       
        // return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
}
