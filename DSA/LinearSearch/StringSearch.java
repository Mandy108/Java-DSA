package DSA.LinearSearch;

public class StringSearch {
    static Boolean Search(String str, char target){
        if(str.length() == 0) return false;
        
        // for(int i =0; i<str.length(); i++){
        //     if(target == str.charAt(i)){
        //         return true;
        //     }
        // }
        // return false;
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String name = "Mandeep Samrat";
        System.out.println(Search(name , 'd'));

    }
}
