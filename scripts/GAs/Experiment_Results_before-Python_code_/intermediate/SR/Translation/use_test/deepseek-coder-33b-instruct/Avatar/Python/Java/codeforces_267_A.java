Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            lst[i] = substract(a, b);
        }
        for (int i : lst) {
            System.out.println(i);
        }
    }

    public static int substract(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        }
        if (a < b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += b / a;
                b = b % a;
                if (b > 0) {
                    total += a / b;
                    a = a % b;
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}
```

This Java code does the same thing as your Python code. It reads the number of test cases, then for each test case, it reads two integers and calls the `substract` method. The result is stored in an array and then printed out.

