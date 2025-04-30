import java.util.*;

public class TwoPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a + b + 2 <= n || (a == b && a == n))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}


// tc - O(1)
// sc - O(1)