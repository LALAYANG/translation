Here is the Java equivalent of the given Python code:

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
            if (a[e] == 0 && e >= lower_limit && e <= upper_limit) {
                System.out.println(e + 1);
                break;
            }
        }
    }
}
```

This Java program reads a line of space-separated integers from the standard input, converts them into an array, and then iterates over the array. If the current element is 0 and its index is within the range of `lower_limit` and `upper_limit` (inclusive), it prints the index plus 1 and stops.

