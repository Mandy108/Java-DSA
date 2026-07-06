package Que;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int rem = n%10;
            System.out.print(rem);
            n = n/ 10;
        }
    }
}
