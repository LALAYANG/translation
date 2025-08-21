Thought Process:
1. Understand the provided code snippet and the sample test case.
2. Identify the key components and logic involved in the problem.
3. Translate the Python code to Java while maintaining the functionality.

Solution:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_rounds = scanner.nextInt();
        int total = 0;
        StringBuilder operations = new StringBuilder();

        for (int x = 0; x < num_rounds; x++) {
            int A = scanner.nextInt();
            int G = scanner.nextInt();

            if (total + A <= 500) {
                total += A;
                operations.append('A');
            } else {
                total -= G;
                operations.append('G');
            }
        }

        System.out.println(operations.toString());
    }
}
```

This solution reads the input values for `num_rounds`, `A`, and `G`, updates the `total` based on the conditions, and appends the corresponding operation ('A' or 'G') to the `operations` string builder. Finally, it prints the concatenated operations as the output.
