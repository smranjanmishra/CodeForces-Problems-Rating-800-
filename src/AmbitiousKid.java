import java.util.*;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) { // n
            arr[i] = sc.nextLong();
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) { // n
            ans = Math.min(ans, Math.abs(arr[i]));
        }
        System.out.println(ans);
    }
}

// tc - O(n)
// sc - O(n)