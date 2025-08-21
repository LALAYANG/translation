Thought process:
1. Understand the provided code snippet and the sample test case.
2. Translate the code snippet into Java code.
3. Ensure the Java code is correct and runs without errors.

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] % min != 0) {
                flag = true;
                break;
            }
        }

        System.out.println(flag ? -1 : min);
    }
}
```

This Java code reads an integer `n` from the input and an array of integers of size `n`. It then finds the minimum element in the array and checks if all elements are divisible by this minimum element. If any element is not divisible, it prints the minimum element; otherwise, it prints -1.
