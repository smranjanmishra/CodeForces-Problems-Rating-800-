import java.util.*;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] a = new long[(int)n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (a[i] == k) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

// TC - O(n)
// SC - O(n)