import java.util.*;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) { // n
                a[i] = sc.nextLong();
            }
            long odd = 0;
            for (int i = 0; i < n; i++) { // n
                if (a[i] % 2 == 1) {
                    odd++;
                }
            }
            if (odd % 2 == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

// tc - O(n) - O(50)
// sc - O(n) - O(50)