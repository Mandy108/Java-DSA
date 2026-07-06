package Que;
import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int digit = 0;
        int sum = 0;
        int prod = 1;
        while(num > 0){
            int rem = num % 10;
            sum+=rem;
            prod*=rem;
            digit++;
            num /= 10; 
        }
        System.out.print("Digit: " + digit + " Sum: " + sum + " Product: " + prod);
    }
    
}
