package DSA.Array;
import java.util.*;
public class MultiAL {
    static void MularrList(){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        //Initialization
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        // Add element
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        MularrList();
    }
}
