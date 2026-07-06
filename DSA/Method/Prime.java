package DSA.Method;

public class Prime {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPrime(n));
    }
    static Boolean isPrime(int n) {
        if(n<=0){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
