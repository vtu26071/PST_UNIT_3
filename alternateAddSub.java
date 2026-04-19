public class Solution {
    public static int alternateAddSub(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                result += i;  
            } else {
                result -= i;   
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(alternateAddSub(n)); 
    }
}

