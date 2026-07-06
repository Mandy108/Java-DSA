package Que;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static int power(int base, int exp){
        int result = 1;
        for(int i = 0; i < exp; i++){
            result *= base;        // multiply base, exp times
        }
        return result;
    }

    static Boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        // count digits manually
        int digits = 0;
        int temp = n;
        while(temp > 0){
            digits++;
            temp /= 10;
        }

        // calculate armstrong sum
        while(n > 0){
            int rem = n % 10;
            sum += power(rem, digits);   // use our own power method
            n /= 10;
        }
        return sum == original;
    }
}