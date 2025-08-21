Here is the Java equivalent of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] numbers = new int[y];
        for (int i = 0; i < y; i++) {
            numbers[i] = scanner.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < y; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (numbers[k] == numbers[i] + numbers[j]) {
                        System.out.println((k + 1) + " " + (j + 1) + " " + (i + 1));
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
        }
        if (!found) {
            System.out.println(-1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `y` and an array of `y` integers from the input. It then iterates over the array to find three numbers that add up to each other. If it finds such a triplet, it prints the indices of the numbers (1-indexed) and stops. If it doesn't find such a triplet, it prints `-1`.

