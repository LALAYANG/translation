Thought process:
1. Understand the input format and the expected output.
2. Identify the key components of the Python code and translate them to Java.
3. Implement the translated code in Java.

```java
import java.util.Scanner;

public class RibbonCutter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int length = arr[0];
        arr = sort(arr[1], arr[2], arr[3]);
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            int outer_loop_limit = 559;
            int inner_loop_limit = 558;
            for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
                int check = length - LoopIndexOut * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    k = check / arr[0];
                    ans = Math.max(ans, k + LoopIndexOut);
                }
            }
        } else {
            int k = 0;
            for (int i = 0; i < length / arr[2] + 1; i++) {
                for (int j = 0; j < length / arr[1] + 1; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int[] sort(int a, int b, int c) {
        int[] arr = {a, b, c};
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
```

This solution translates the given Python code to Java and provides the expected output for the given test input.
