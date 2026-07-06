package Loops;

public class E {
    static void pattern4(int n){
        int row,col;
        for(row=1; row<=n; row++){
            for(col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern4(5);
    }
}
