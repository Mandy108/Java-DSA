package Que;
import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt();
        int num = 2;
        int count = 0;
        while(count < n){
            Boolean isPrime = true;

            for(int i = 2; i*i <= num; i++){
                if(num % i ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}