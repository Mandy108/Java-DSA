package Loops;
import java.util.*;
public class B {
    static void pattern1(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=1; i<n; i++) {
            for(int j=1; j<=i; j++)
                System.out.print("*");
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1();
    }

}
