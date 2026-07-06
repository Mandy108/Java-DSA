package DSA.Method;

public class Swap {
    public static void main(String[] args) {
       swap(10,20); 
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +" "+ b);
    }
}
