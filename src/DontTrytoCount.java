import java.util.*;

public class DontTrytoCount {
    public static boolean check(String s, String x) {
        if (x.length() < s.length()) {
            return false;
        }
        for (int i = 0; i <= x.length() - s.length(); i++) {
            if (x.substring(i, i + s.length()).equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            String x0 = x;
            String x1 = x0 + x0;
            String x2 = x1 + x1;
            String x3 = x2 + x2;
            String x4 = x3 + x3;
            String x5 = x4 + x4;
            int ans = -1;
            if (check(s, x0)) {
                ans = 0;
            } else if (check(s, x1)) {
                ans = 1;
            } else if (check(s, x2)) {
                ans = 2;
            } else if (check(s, x3)) {
                ans = 3;
            } else if (check(s, x4)) {
                ans = 4;
            } else if (check(s, x5)) {
                ans = 5;
            }
            System.out.println(ans);
        }
    }
}

// TC - O(n*m)
// SC - O(m)