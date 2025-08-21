```java
import java.util.concurrent.ThreadLocalRandom;

public class CalculateCombinations {
    public static void main(String[] args) {
        int n = 10;
        int M = 100;
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = ThreadLocalRandom.current().nextInt(1, M + 1);
        }

        int[] cumulativeRemainders = calculateCumulativeRemainders(M, A);
        Counter<Integer> remainderCounts = new Counter<>();
        for (int remainder : cumulativeRemainders) {
            remainderCounts.increment(remainder);
        }

        int combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += count * (count - 1) / 2;
        }

        System.out.println(combinations);
    }

    private static int[] calculateCumulativeRemainders(int M, int[] A) {
        int[] cumulativeRemainders = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            cumulativeRemainders[i] = (A[i] % M + cumulativeRemainders[i - 1]) % M;
        }
        return cumulativeRemainders;
    }
}

class Counter<T> {
    private Map<T, Integer> map = new HashMap<>();

    public void increment(T key) {
        if (!map.containsKey(key)) {
            map.put(key, 0);
        }
        map.put(key, map.get(key) + 1);
    }

    public int get(T key) {
        return map.getOrDefault(key, 0);
    }

    public int size() {
        return map.size();
    }

    public Set<T> keySet() {
        return map.keySet();
    }
}
```
Explanation:

The Python code you provided is a bit complex, but I'll try to explain the main idea behind it.

The code is trying to calculate the number of combinations of a set of numbers that can be used to form a given number. For example, if the number is 10 and the set of numbers is [1, 2, 3, 4], the number of combinations is 4 (1+2+3+4=10).

The code first calculates the cumulative remainders of the numbers in the set, which is the remainder of each number when divided by the given number. For example, if the given number is 10 and the set of numbers is [1, 2, 3, 4], the cumulative remainders are [1, 2, 3, 4].

Then, the code counts the number of occurrences of each remainder in the cumulative remainders array. This is done using a `Counter` object, which is a simple class that keeps track of the number of occurrences of each key in a map.

Finally, the code calculates the number of combinations by iterating over the remainders and their counts, and using the formula `combinations = count * (count - 1) / 2` to calculate the number of combinations for each remainder. The total number of combinations is the sum of these values.

In the Java code, I've implemented the `Counter` class as a simple map that keeps track of the number of occurrences of each key. The `calculateCumulativeRemainders` method calculates the cumulative remainders of the numbers in the set, and the `main` method calculates the number of combinations using the formula mentioned above.

Note that the Java code is a bit simpler than the Python code, as it doesn't use threads or queues. However, the main idea behind the code is the same.
