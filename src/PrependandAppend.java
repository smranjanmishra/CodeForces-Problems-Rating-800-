import java.util.Scanner;

public class PrependandAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            String s = sc.next();
            long ans = n;
            long left = 0, right = n - 1;
            while (left <= right) {
                if (s.charAt((int) left) != s.charAt((int) right))
                    ans -= 2;
                else
                    break;
                left++;
                right--;
            }
            System.out.println(ans);
        }
    }
}

// tc - O(n), sc - O(n)