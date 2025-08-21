Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 0, 4, 5);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a list of integers, and then iterates over the list. If it finds a 0, it prints the index of that 0 (plus 1 because Python uses 0-based indexing, but we want 1-based indexing for the output) and then stops.

