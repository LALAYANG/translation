
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        Arrays.sort(values);
        int minValue = values[0];
        int maxValue = values[n - 1];
        if (minValue == maxValue) {
            System.out.println(maxValue - minValue + " " + n * (n - 1) / 2);
        } else {
            int maxCount = 0;
            int minCount = 0;
            for (int i = 0; i < n; i++) {
                if (values[i] == maxValue) {
                    maxCount++;
                } else if (values[i] == minValue) {
                    minCount++;
                }
            }
            System.out.println(maxValue - minValue + " " + maxCount * minCount);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the input values. It then checks if the minimum and maximum values are the same, and if so, it prints the difference between them and the number of pairs of values that are equal to the minimum and maximum values. If the minimum and maximum values are not the same, it counts the number of times each value appears in the input, and then prints the difference between the maximum and minimum values and the product of the number of times the maximum value appears and the number of times the minimum value appears.
