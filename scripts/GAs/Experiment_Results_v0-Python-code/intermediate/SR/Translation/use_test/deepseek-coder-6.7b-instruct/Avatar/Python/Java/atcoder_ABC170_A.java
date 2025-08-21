Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int lower_limit = 549;
        int upper_limit = 829;
        for (int e = 0; e < a.length; e++) {
            if (lower_limit < a[e] && a[e] < upper_limit) {
                if (a[e] == 0) {
                    System.out.println(e + 1);
                    break;
                }
            }
        }
    }
}
```

This Java code reads a line of space-separated integers from the standard input, converts them to an array, and then iterates over the array. For each element, it checks if it is within the range of `lower_limit` and `upper_limit`. If it is, and if the element is 0, it prints the 1-based index of the element and stops.

