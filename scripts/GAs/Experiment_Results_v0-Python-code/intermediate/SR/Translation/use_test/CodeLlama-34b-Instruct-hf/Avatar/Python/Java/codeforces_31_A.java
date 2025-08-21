```java
import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = numbers[i] + numbers[j];
                for (int k = j + 1; k < n; k++) {
                    if (numbers[k] == sum) {
                        System.out.println(i + 1 + " " + j + 1 + " " + k + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```
Explanation:

The code above is a Java implementation of the Python code you provided. It uses a similar approach to find the triplet that sums to a given value.

The main difference between the two codes is that the Python code uses a decorator to shuffle the input array, while the Java code uses a simple for loop to iterate over the input array.

Also, the Java code uses the `System.out.println()` method to print the output, while the Python code uses the `print()` function.

Note that the Java code assumes that the input array is sorted in ascending order, while the Python code does not make this assumption. If the input array is not sorted, the Java code will not work correctly.
