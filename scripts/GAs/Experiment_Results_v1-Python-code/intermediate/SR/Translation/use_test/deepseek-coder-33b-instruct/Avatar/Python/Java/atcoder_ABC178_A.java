Here is the Java translation of the Python code. Note that Java does not have a direct equivalent to Python's decorators, so I've removed the decorator. Also, Java does not have a direct equivalent to Python's scipy library, so I've removed the ttest_ind function.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcs = 1;
        int test_case_id = 1;
        int current_val = 132;
        int step = 131;
        while (current_val % step == 1) {
            current_val = current_val + 1;
            while (test_case_id <= tcs) {
                solve(test_case_id, scanner);
                test_case_id += 1;
            }
        }
    }

    public static void solve(int test_case_id, Scanner scanner) {
        int a = scanner.nextInt();
        System.out.println(a == 0 ? 1 : 0);
    }
}
```

This Java code reads the same input as the Python code, and prints the same output. It uses a Scanner to read the input, and a ternary operator to print the result.

