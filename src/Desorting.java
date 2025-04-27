import java.util.*;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long op = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] <= a[i + 1]) { // sorted
                    long diff = a[i + 1] - a[i]; // always positive
                    long req = diff / 2 + 1;
                    op = Math.min(op, req);
                } else { // unsorted
                    op = 0;
                }
            }
            System.out.println(op);
        }
    }
}

// tc - O(n) = O(500)
// sc - O(n) = O(500)