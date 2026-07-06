package Loops;
import java.util.*;
public class F {
    static void pattern5(int n){
        int i,j;
        for (i=0; i<n*2; i++) {
            int totalColsInRow = i > n ? 2 * n - i : i;
            for(j=0; j<totalColsInRow; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
        static void temp(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter temprature in celsius: ");
            float c = in.nextFloat();
            float f = (c * 9/5) + 32;
            System.out.println("Temprature in Fahrenheit is: " + f);
        }
    public static void main(String[] args) {
        // pattern5(10);
        temp();
    }
}
