import java.util.*;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long mx = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                mx = Math.max(mx, a[i]);
            }
            List<Long> b = new ArrayList<>();
            List<Long> c = new ArrayList<>();
            for (int i = 0; i < n; i++) {
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
                for (long it : b) {
                    System.out.print(it + " ");
                }
                System.out.println();
                for (long it : c) {
                    System.out.print(it + " ");
                }
                System.out.println();
            }
        }
    }
}

// tc - O(n)
// sc - O(n)