package DSA.Method;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        for(int i=10; i<=n; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static Boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();   // count digits
        while(n > 0){
            int rem = n % 10;
            // sum += rem*rem*rem;
            // sum += (int) Math.pow(rem, digits);    // raise to power of digits
            for(int i=0; i<)
            n/=10;
        }
        return sum == original;
    }
}
