package Leetcode;
public class CeilingString {
        static char ceilingString(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // Wrap around if target is greater than or equal to the last letter
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'z';
        char ans = ceilingString(letters,target);
        System.out.println(ans);
    }
}
