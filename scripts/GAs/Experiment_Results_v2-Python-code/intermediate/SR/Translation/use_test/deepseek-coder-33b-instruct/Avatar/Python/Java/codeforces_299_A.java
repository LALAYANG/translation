Here is the Java equivalent of the Python code. Note that Java does not support decorators, lambda functions, and some Python built-in functions like `map`, `filter`, `reduce`, `open`, `input`, `print`, etc. Also, Java does not have built-in support for cryptography, HTTP, and date parsing libraries.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        boolean anyMatch = Arrays.stream(arr).anyMatch(i -> i % min != 0);
        System.out.println(anyMatch ? min : -1);
    }
}
```

This Java code reads the input, sorts the array, finds the minimum element, checks if any element in the array is not divisible by the minimum element, and prints the minimum element if such an element exists, otherwise it prints -1.

