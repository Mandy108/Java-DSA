package Loops;
import java.util.*;
public class A {
    public static void main(String[] args) {
       a();
       
    }
    static void a(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 0; row < n; row++) {
            for(int col=0; col<n; col++)
                System.out.print("*");

            System.out.println();
            }
        
    }
}
