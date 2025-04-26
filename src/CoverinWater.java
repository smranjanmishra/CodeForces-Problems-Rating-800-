import  java.util.*;

public class CoverinWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int length = sc.nextInt();
            String seats = sc.next();
            boolean hasThreeEmptyTogether = false;
            int emptyCount = 0;
            for (int i = 0; i < length; i++) {
                if (i + 2 < length &&
                        seats.charAt(i) == '.' &&
                        seats.charAt(i + 1) == '.' &&
                        seats.charAt(i + 2) == '.') {

                    hasThreeEmptyTogether = true;
                    break;
                }

                if (seats.charAt(i) == '.') {
                    emptyCount++;
                }
            }

            if (hasThreeEmptyTogether) {
                System.out.println(2);
            } else {
                System.out.println(emptyCount);
            }
        }
    }
}

// tc - O(n) = O(100)
// sc - O(1)