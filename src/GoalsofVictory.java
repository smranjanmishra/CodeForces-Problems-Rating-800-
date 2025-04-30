import java.util.*;

public class GoalsofVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += sc.nextLong();
            }
            System.out.println(-1 * sum);
        }
    }
}


// TC - O(n)
// SC - O(1)