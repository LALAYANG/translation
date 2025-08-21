Thought Process:
1. Understand the input format and the expected output.
2. Identify the key components of the Python code snippet.
3. Translate the code snippet into a Java equivalent program.
4. Ensure the Java program runs correctly and produces the expected output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outer_loop_bound = 363;
        int inner_loop_bound = 362;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int[] input_list = new int[3];
                for (int j = 0; j < 3; j++) {
                    input_list[j] = scanner.nextInt();
                }

                if ((condition1 & condition2) > 0) {
                    if (sum(input_list) > 1) {
                        int input_flag = 1;
                        c = c + input_flag;
                    }
                }
            }
        }

        System.out.println(c);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```

This Java program reads input values for `n` and iterates through the loops to calculate the final value of `c` based on the conditions specified in the Python code snippet.
