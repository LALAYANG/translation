Thought process:
1. Understand the provided code snippet and the problem it aims to solve.
2. Identify the key components and logic involved in the code.
3. Translate the Python code to Java while maintaining the functionality and output.

Solution:
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        int c = 2;
        for (int i : numbers) {
            if (i == 1) {
                System.out.println(c);
            } else if (i % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}
```

This solution translates the provided Python code snippet to Java, ensuring the same functionality and output as the expected output.
