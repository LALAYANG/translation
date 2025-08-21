```java
import java.util.Scanner;

class CodeforcesTask397BSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (k * a >= b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```
Explanation:

* The program first reads the input from the user, which is the number of test cases `t`.
* It then loops through each test case and reads the input for each test case, which is the value of `k`, `a`, and `b`.
* It then calculates the result for each test case by checking if `k * a >= b`. If the condition is true, it prints "Yes", otherwise it prints "No".
* Finally, it prints the result for each test case on a new line.

Note: The program uses the `Scanner` class to read the input from the user, and the `System.out.println()` method to print the result.
