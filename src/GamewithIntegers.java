import java.util.*;

public class GamewithIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            long number = sc.nextLong();
            if (number % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}


// tc - O(1)
// sc - O(1)