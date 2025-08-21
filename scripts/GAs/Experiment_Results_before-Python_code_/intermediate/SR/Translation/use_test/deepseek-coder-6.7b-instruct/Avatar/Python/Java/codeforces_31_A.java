Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]) {
                        System.out.println((k + 1) + " " + (j + 1) + " " + (i + 1));
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `y` and an array of `y` integers from the input. It then iterates over the array to find three indices `i`, `j`, and `k` such that `arr[i] + arr[j] = arr[k]` and `i`, `j`, and `k` are different. If such a triplet is found, it prints the indices and exits. If no such triplet is found after checking all possible combinations, it prints `-1`.

