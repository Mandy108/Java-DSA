package Que;
import java.util.*;
public class gcdlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give Two Number for: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
        while(num2 != 0){
            int rem = num1 % num2; 
            num1 = num2;            
            num2 = rem;          
        }
        int gcd = num1;
        int lcm = a * b / gcd;
        System.out.println("GCD: " + gcd + "  LCM: " + lcm);
    }
}
