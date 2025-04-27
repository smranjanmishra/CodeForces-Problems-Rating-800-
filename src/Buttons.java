import java.util.*;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if (c % 2 == 1) { // odd
                if (b > a) { // 1
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            } else { // even
                if (a > b) { // 1
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
    }
}

// tc - O(1)
// sc - O(1)