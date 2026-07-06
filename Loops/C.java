package Loops;

import java.util.Scanner;

public class C {
    static void pattern2(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            // System.out.println("*");
            for (int j=0; j<n-1-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern2();
    }
}
