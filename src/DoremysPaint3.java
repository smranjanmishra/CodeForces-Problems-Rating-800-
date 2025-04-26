import java.util.*;

public class DoremysPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            TreeMap<Long, Long> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                map.put(a[i], map.getOrDefault(a[i], 0L) + 1);
            }

            if (map.size() >= 3) {
                System.out.println("No");
            } else {
                long freq1 = map.firstEntry().getValue();
                long freq2 = map.lastEntry().getValue();
                if (freq1 == freq2) {
                    System.out.println("Yes");
                } else if (n % 2 == 1 && Math.abs(freq1 - freq2) == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}


// TC: O(n log n)
// SC: O(n)