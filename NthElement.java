public class Solution {
    public static int findNth(int n) {
        int a = 1, b = 2, c = 3;
        if (n == 1) return a;
        if (n == 2) return b;
        if (n == 3) return c;
        int next = 0;
        for (int i = 4; i <= n; i++) {
            next = a + b + c; // example series: sum of previous 3 terms
            a = b;
            b = c;
            c = next;
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findNth(n));
    }
}
