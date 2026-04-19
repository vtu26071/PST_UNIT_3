import java.util.*;
public class Solution {
    public static String getCode(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i); // get ASCII value
            result.append(ascii);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println(getCode(input)); // Output: 656667
    }
}
