import java.util.*;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] b = new long[(int) n];
            List<Long> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }
            a.add(b[0]);
            for (int i = 1; i < n; i++) {
                if (b[i] >= b[i - 1]) {
                    a.add(b[i]);
                } else {
                    a.add(b[i]);
                    a.add(b[i]);
                }
            }
            System.out.println(a.size());
            for (long it : a) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}


// tc = O(n)
// sc = O(n)