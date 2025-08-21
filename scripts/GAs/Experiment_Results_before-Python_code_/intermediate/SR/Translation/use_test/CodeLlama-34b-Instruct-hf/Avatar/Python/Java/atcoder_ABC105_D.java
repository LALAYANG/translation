```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] cumulativeRemainders = new int[N + 1];
        for (int i = 0; i < N; i++) {
            cumulativeRemainders[i + 1] = (cumulativeRemainders[i] + A[i]) % M;
        }

        HashMap<Integer, Integer> remainderCounts = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int remainder = cumulativeRemainders[i + 1] - cumulativeRemainders[i];
            if (remainderCounts.containsKey(remainder)) {
                remainderCounts.put(remainder, remainderCounts.get(remainder) + 1);
            } else {
                remainderCounts.put(remainder, 1);
            }
        }

        int combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += count * (count - 1) / 2;
        }

        System.out.println(combinations);
    }
}
```

Explanation:

The code first reads the input from the user, which consists of two integers N and M, and an array A of length N.

Then, it calculates the cumulative remainders of the elements of A when divided by M, and stores them in an array cumulativeRemainders.

Next, it creates a HashMap remainderCounts to store the count of each remainder. It iterates over the elements of cumulativeRemainders and increments the count of each remainder in the HashMap.

Finally, it calculates the number of combinations by iterating over the values of the HashMap and adding the product of each count and the previous count to the total combinations.

The output is the number of combinations.
