import java.util.*;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) { // n
                a[i] = sc.nextLong();
            }
            long mx = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) { // n
                mx = Math.max(mx, a[i]);
            }
            List<Long> b = new ArrayList<>();
            List<Long> c = new ArrayList<>();
            for (int i = 0; i < n; i++) { // n
                if (a[i] != mx) {
                    b.add(a[i]);
                } else {
                    c.add(a[i]);
                }
            }
            if (b.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());
                for (long it : b) { // n
                    System.out.print(it + " ");
                }
                System.out.println();
                for (long it : c) { // n
                    System.out.print(it + " ");
                }
                System.out.println();
            }
        }
    }
}

// tc - O(n) - O(100)
// sc - O(n) - O(100)