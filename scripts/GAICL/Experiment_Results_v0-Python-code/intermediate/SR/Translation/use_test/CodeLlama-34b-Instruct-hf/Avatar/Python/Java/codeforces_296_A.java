```java
import java.util.Scanner;

public class ThresholdCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");

        // Calculate the threshold
        double threshold = calculateThreshold(n, 2);

        // Check if the counts are possible
        boolean isPossible = true;
        for (String element : set(m)) {
            if (m.count(element) >= threshold + 1) {
                isPossible = false;
                break;
            }
        }

        // Print the result
        System.out.println(isPossible ? "YES" : "NO");
    }

    public static double calculateThreshold(int n, int k) {
        // Calculate the threshold using the given formula
        return n / k;
    }

    public static Set<String> set(String[] m) {
        // Create a set from the given array
        return new HashSet<String>(Arrays.asList(m));
    }
}
```
Note: The `set` method is not a built-in method in Java, so you will need to define it yourself.

Explanation:

The `ThresholdCalculator` class has a `main` method that takes an `int` and a `String[]` as input. The `main` method first calculates the threshold using the `calculateThreshold` method, and then checks if the counts are possible using the `checkCounts` method. Finally, it prints the result to the console.

The `calculateThreshold` method takes two `int`s as input and returns a `double` representing the threshold. The formula for calculating the threshold is `n / k`.

The `checkCounts` method takes a `String[]` as input and returns a `boolean` representing whether the counts are possible. The method first creates a set from the given array using the `set` method. Then, it iterates over the set and checks if the count of each element is greater than or equal to the threshold plus one. If the count is greater than or equal to the threshold plus one, the method returns `false`. Otherwise, it returns `true`.

The `set` method takes a `String[]` as input and returns a `Set<String>` representing the set of unique elements in the array. The method uses the `HashSet` class to create the set.
