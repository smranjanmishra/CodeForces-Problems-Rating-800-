import java.util.Scanner;

public class GrasshopperonaLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long k = sc.nextLong();
            if (x % k == 0) {
                System.out.println(2);
                System.out.println(1 + " " + (x - 1));
            } else {
                System.out.println(1);
                System.out.println(x);
            }
        }
    }
}


// tc - O(1)
// sc - O(1)